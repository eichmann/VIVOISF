package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasResearchAreaIterator theDateTimeIntervalHasResearchAreaIterator = (DateTimeIntervalHasResearchAreaIterator)findAncestorWithClass(this, DateTimeIntervalHasResearchAreaIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

