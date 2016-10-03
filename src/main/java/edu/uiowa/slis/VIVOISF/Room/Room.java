package edu.uiowa.slis.VIVOISF.Room;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Room extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Room currentInstance = null;
	private static final Log log = LogFactory.getLog(Room.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String seatingCapacity = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			RoomIterator theRoomIterator = (RoomIterator) findAncestorWithClass(this, RoomIterator.class);

			if (theRoomIterator != null) {
				subjectURI = theRoomIterator.getSubjectURI();
				label = theRoomIterator.getLabel();
			}

			if (theRoomIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?seatingCapacity ?seatingCapacity where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#seatingCapacity> ?seatingCapacity } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#seatingCapacity> ?seatingCapacity } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					seatingCapacity = sol.get("?seatingCapacity") == null ? null : sol.get("?seatingCapacity").toString();
					seatingCapacity = sol.get("?seatingCapacity") == null ? null : sol.get("?seatingCapacity").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Room doStartTag", e);
			throw new JspTagException("Exception raised in Room doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Room doEndTag", e);
			throw new JspTagException("Exception raised in Room doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

}
