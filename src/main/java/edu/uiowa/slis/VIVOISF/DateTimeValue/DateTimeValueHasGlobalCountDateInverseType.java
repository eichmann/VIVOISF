package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasGlobalCountDateInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasGlobalCountDateInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasGlobalCountDateInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasGlobalCountDateInverseIterator theDateTimeValueHasGlobalCountDateInverseIterator = (DateTimeValueHasGlobalCountDateInverseIterator)findAncestorWithClass(this, DateTimeValueHasGlobalCountDateInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueHasGlobalCountDateInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasGlobalCountDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasGlobalCountDate tag ");
		}
		return SKIP_BODY;
	}
}

