package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasResearchAreaIterator theDateTimeValueHasResearchAreaIterator = (DateTimeValueHasResearchAreaIterator)findAncestorWithClass(this, DateTimeValueHasResearchAreaIterator.class);
			pageContext.getOut().print(theDateTimeValueHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

