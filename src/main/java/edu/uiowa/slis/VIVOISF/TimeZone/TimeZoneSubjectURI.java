package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			if (!theTimeZone.commitNeeded) {
				pageContext.getOut().print(theTimeZone.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			return theTimeZone.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TimeZone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TimeZone theTimeZone = (TimeZone)findAncestorWithClass(this, TimeZone.class);
			theTimeZone.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for subjectURI tag ");
		}
	}
}

