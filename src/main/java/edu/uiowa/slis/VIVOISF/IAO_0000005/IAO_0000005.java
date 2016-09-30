package edu.uiowa.slis.VIVOISF.IAO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class IAO_0000005 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000005 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000005.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			IAO_0000005Iterator theIAO_0000005Iterator = (IAO_0000005Iterator) findAncestorWithClass(this, IAO_0000005Iterator.class);

			if (theIAO_0000005Iterator != null) {
				subjectURI = theIAO_0000005Iterator.getSubjectURI();
				label = theIAO_0000005Iterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OBI_0000011.OBI_0000011OBI_0000417Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OBI_0000011.OBI_0000011OBI_0000417Iterator)this.getParent()).getOBI_0000417();
			}

			edu.uiowa.slis.VIVOISF.OBI_0000011.OBI_0000011OBI_0000417Iterator theOBI_0000011OBI_0000417Iterator = (edu.uiowa.slis.VIVOISF.OBI_0000011.OBI_0000011OBI_0000417Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OBI_0000011.OBI_0000011OBI_0000417Iterator.class);

			if (subjectURI == null && theOBI_0000011OBI_0000417Iterator != null) {
				subjectURI = theOBI_0000011OBI_0000417Iterator.getOBI_0000417();
			}

			if (theIAO_0000005Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
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
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in IAO_0000005 doStartTag", e);
			throw new JspTagException("Exception raised in IAO_0000005 doStartTag");
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
			log.error("Exception raised in IAO_0000005 doEndTag", e);
			throw new JspTagException("Exception raised in IAO_0000005 doEndTag");
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

}
