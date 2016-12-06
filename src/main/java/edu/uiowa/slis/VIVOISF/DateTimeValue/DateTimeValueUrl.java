package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueUrlIterator theDateTimeValue = (DateTimeValueUrlIterator)findAncestorWithClass(this, DateTimeValueUrlIterator.class);
			pageContext.getOut().print(theDateTimeValue.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for url tag ");
		}
		return SKIP_BODY;
	}
}

