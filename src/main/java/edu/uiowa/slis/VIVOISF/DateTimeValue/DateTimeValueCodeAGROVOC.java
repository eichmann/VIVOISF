package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeAGROVOCIterator theDateTimeValue = (DateTimeValueCodeAGROVOCIterator)findAncestorWithClass(this, DateTimeValueCodeAGROVOCIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

