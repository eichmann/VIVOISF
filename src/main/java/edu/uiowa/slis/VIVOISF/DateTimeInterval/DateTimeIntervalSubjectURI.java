package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			if (!theDateTimeInterval.commitNeeded) {
				pageContext.getOut().print(theDateTimeInterval.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			return theDateTimeInterval.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeInterval for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DateTimeInterval theDateTimeInterval = (DateTimeInterval)findAncestorWithClass(this, DateTimeInterval.class);
			theDateTimeInterval.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for subjectURI tag ");
		}
	}
}

