package edu.uiowa.slis.VIVOISF.CalendarBusy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CalendarBusyCalendarBusyIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarBusyCalendarBusyIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarBusyCalendarBusyIterator.class);

	String subjectURI = null;
	String calendarBusy = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CalendarBusy ancestorInstance = (CalendarBusy) findAncestorWithClass(this, CalendarBusy.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://www.w3.org/2006/vcard/ns#calendarBusy> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				calendarBusy = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CalendarBusyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CalendarBusyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				calendarBusy = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CalendarBusyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CalendarBusyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in CalendarBusy doEndTag", e);
			throw new JspTagException("Exception raised in CalendarBusy doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCalendarBusy(String calendarBusy) {
		this.calendarBusy = calendarBusy;
	}

	public String getCalendarBusy() {
		return calendarBusy;
	}

}
