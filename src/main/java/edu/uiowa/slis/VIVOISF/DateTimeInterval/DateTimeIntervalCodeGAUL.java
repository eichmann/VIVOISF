package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeGAULIterator theDateTimeInterval = (DateTimeIntervalCodeGAULIterator)findAncestorWithClass(this, DateTimeIntervalCodeGAULIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

