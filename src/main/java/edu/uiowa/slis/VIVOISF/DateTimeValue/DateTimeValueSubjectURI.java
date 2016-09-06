package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			if (!theDateTimeValue.commitNeeded) {
				pageContext.getOut().print(theDateTimeValue.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			return theDateTimeValue.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DateTimeValue theDateTimeValue = (DateTimeValue)findAncestorWithClass(this, DateTimeValue.class);
			theDateTimeValue.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for subjectURI tag ");
		}
	}
}

