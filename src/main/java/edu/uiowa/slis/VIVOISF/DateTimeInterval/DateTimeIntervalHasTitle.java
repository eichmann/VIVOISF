package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasTitleIterator theDateTimeIntervalHasTitleIterator = (DateTimeIntervalHasTitleIterator)findAncestorWithClass(this, DateTimeIntervalHasTitleIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

