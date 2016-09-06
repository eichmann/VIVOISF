package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionSubjectAreaOfIterator theDateTimeValuePrecisionSubjectAreaOfIterator = (DateTimeValuePrecisionSubjectAreaOfIterator)findAncestorWithClass(this, DateTimeValuePrecisionSubjectAreaOfIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

