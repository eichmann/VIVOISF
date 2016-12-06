package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasTitleIterator theDateTimeValueHasTitleIterator = (DateTimeValueHasTitleIterator)findAncestorWithClass(this, DateTimeValueHasTitleIterator.class);
			pageContext.getOut().print(theDateTimeValueHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

