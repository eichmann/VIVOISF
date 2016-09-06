package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeValueDateTimePrecisionIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimePrecisionIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimePrecisionIterator.class);

	String subjectURI = null;
	String type = null;
	String dateTimePrecision = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue) findAncestorWithClass(this, DateTimeValue.class);

			if (theDateTimeValue != null) {
				subjectURI = theDateTimeValue.getSubjectURI();
			}

			if (theDateTimeValue == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#dateTimePrecision> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				dateTimePrecision = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + dateTimePrecision + "	type: " + type);
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValueDateTimePrecisionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeValueDateTimePrecisionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				dateTimePrecision = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				log.info("instance: " + dateTimePrecision + "	type: " + type);
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValueDateTimePrecisionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in DateTimeValueDateTimePrecisionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in DateTimeValueDateTimePrecision doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeValueDateTimePrecision doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setDateTimePrecision(String dateTimePrecision) {
		this.dateTimePrecision = dateTimePrecision;
	}

	public String getDateTimePrecision() {
		return dateTimePrecision;
	}

}
