package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueBFO_0000050Iterator theDateTimeValueBFO_0000050Iterator = (DateTimeValueBFO_0000050Iterator)findAncestorWithClass(this, DateTimeValueBFO_0000050Iterator.class);
			pageContext.getOut().print(theDateTimeValueBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

