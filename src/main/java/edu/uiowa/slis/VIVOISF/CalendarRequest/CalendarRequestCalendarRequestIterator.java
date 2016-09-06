package edu.uiowa.slis.VIVOISF.CalendarRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CalendarRequestCalendarRequestIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarRequestCalendarRequestIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarRequestCalendarRequestIterator.class);

	String subjectURI = null;
	String calendarRequest = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CalendarRequest ancestorInstance = (CalendarRequest) findAncestorWithClass(this, CalendarRequest.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://www.w3.org/2006/vcard/ns#calendarRequest> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				calendarRequest = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CalendarRequestIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CalendarRequestIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				calendarRequest = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CalendarRequestIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CalendarRequestIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in CalendarRequest doEndTag", e);
			throw new JspTagException("Exception raised in CalendarRequest doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCalendarRequest(String calendarRequest) {
		this.calendarRequest = calendarRequest;
	}

	public String getCalendarRequest() {
		return calendarRequest;
	}

}
