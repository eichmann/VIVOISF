package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeUNIterator theDateTimeValue = (DateTimeValueCodeUNIterator)findAncestorWithClass(this, DateTimeValueCodeUNIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

