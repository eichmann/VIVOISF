package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasEmailIterator theDateTimeIntervalHasEmailIterator = (DateTimeIntervalHasEmailIterator)findAncestorWithClass(this, DateTimeIntervalHasEmailIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

