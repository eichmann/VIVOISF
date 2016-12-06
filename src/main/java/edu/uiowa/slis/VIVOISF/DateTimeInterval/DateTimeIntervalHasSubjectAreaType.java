package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasSubjectAreaIterator theDateTimeIntervalHasSubjectAreaIterator = (DateTimeIntervalHasSubjectAreaIterator)findAncestorWithClass(this, DateTimeIntervalHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

