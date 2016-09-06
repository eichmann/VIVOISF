package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			if (!theDateTimeValuePrecision.commitNeeded) {
				pageContext.getOut().print(theDateTimeValuePrecision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			return theDateTimeValuePrecision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DateTimeValuePrecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DateTimeValuePrecision theDateTimeValuePrecision = (DateTimeValuePrecision)findAncestorWithClass(this, DateTimeValuePrecision.class);
			theDateTimeValuePrecision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for subjectURI tag ");
		}
	}
}

