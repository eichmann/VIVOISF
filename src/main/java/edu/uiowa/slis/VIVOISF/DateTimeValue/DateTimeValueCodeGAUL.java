package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeGAULIterator theDateTimeValue = (DateTimeValueCodeGAULIterator)findAncestorWithClass(this, DateTimeValueCodeGAULIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

