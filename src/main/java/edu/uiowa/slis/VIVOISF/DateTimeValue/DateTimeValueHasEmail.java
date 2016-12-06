package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasEmailIterator theDateTimeValueHasEmailIterator = (DateTimeValueHasEmailIterator)findAncestorWithClass(this, DateTimeValueHasEmailIterator.class);
			pageContext.getOut().print(theDateTimeValueHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

