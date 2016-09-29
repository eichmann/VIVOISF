package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class area extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static area currentInstance = null;
	private static final Log log = LogFactory.getLog(area.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			areaIterator theareaIterator = (areaIterator) findAncestorWithClass(this, areaIterator.class);

			if (theareaIterator != null) {
				subjectURI = theareaIterator.getSubjectURI();
				label = theareaIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.area.areaIsSuccessorOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.area.areaIsSuccessorOfIterator)this.getParent()).getIsSuccessorOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.area.areaIsPredecessorOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.area.areaIsPredecessorOfIterator)this.getParent()).getIsPredecessorOf();
			}

			edu.uiowa.slis.VIVOISF.area.areaIsSuccessorOfIterator theareaIsSuccessorOfIterator = (edu.uiowa.slis.VIVOISF.area.areaIsSuccessorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.area.areaIsSuccessorOfIterator.class);

			if (subjectURI == null && theareaIsSuccessorOfIterator != null) {
				subjectURI = theareaIsSuccessorOfIterator.getIsSuccessorOf();
			}

			edu.uiowa.slis.VIVOISF.area.areaIsPredecessorOfIterator theareaIsPredecessorOfIterator = (edu.uiowa.slis.VIVOISF.area.areaIsPredecessorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.area.areaIsPredecessorOfIterator.class);

			if (subjectURI == null && theareaIsPredecessorOfIterator != null) {
				subjectURI = theareaIsPredecessorOfIterator.getIsPredecessorOf();
			}

			if (theareaIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in area doStartTag", e);
			throw new JspTagException("Exception raised in area doStartTag");
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
			log.error("Exception raised in area doEndTag", e);
			throw new JspTagException("Exception raised in area doEndTag");
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
