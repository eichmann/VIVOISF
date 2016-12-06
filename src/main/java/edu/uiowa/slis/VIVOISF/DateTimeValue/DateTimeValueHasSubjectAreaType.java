package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasSubjectAreaIterator theDateTimeValueHasSubjectAreaIterator = (DateTimeValueHasSubjectAreaIterator)findAncestorWithClass(this, DateTimeValueHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDateTimeValueHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

