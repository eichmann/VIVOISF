package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeAGROVOCIterator theDateTimeInterval = (DateTimeIntervalCodeAGROVOCIterator)findAncestorWithClass(this, DateTimeIntervalCodeAGROVOCIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

