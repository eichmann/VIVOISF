package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueFreetextKeywordIterator theDateTimeValue = (DateTimeValueFreetextKeywordIterator)findAncestorWithClass(this, DateTimeValueFreetextKeywordIterator.class);
			pageContext.getOut().print(theDateTimeValue.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

