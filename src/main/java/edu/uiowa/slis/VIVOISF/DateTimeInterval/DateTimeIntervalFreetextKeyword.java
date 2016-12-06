package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalFreetextKeywordIterator theDateTimeInterval = (DateTimeIntervalFreetextKeywordIterator)findAncestorWithClass(this, DateTimeIntervalFreetextKeywordIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

