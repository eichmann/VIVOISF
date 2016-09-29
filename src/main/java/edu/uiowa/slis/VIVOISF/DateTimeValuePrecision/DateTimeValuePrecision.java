package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeValuePrecision extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecision currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecision.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeValuePrecisionIterator theDateTimeValuePrecisionIterator = (DateTimeValuePrecisionIterator) findAncestorWithClass(this, DateTimeValuePrecisionIterator.class);

			if (theDateTimeValuePrecisionIterator != null) {
				subjectURI = theDateTimeValuePrecisionIterator.getSubjectURI();
				label = theDateTimeValuePrecisionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimePrecisionIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimePrecisionIterator)this.getParent()).getDateTimePrecision();
			}

			edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimePrecisionIterator theDateTimeValueDateTimePrecisionIterator = (edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimePrecisionIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimePrecisionIterator.class);

			if (subjectURI == null && theDateTimeValueDateTimePrecisionIterator != null) {
				subjectURI = theDateTimeValueDateTimePrecisionIterator.getDateTimePrecision();
			}

			if (theDateTimeValuePrecisionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in DateTimeValuePrecision doStartTag", e);
			throw new JspTagException("Exception raised in DateTimeValuePrecision doStartTag");
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
			log.error("Exception raised in DateTimeValuePrecision doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeValuePrecision doEndTag");
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
