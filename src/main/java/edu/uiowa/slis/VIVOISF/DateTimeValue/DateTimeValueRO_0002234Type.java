package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRO_0002234Iterator theDateTimeValueRO_0002234Iterator = (DateTimeValueRO_0002234Iterator)findAncestorWithClass(this, DateTimeValueRO_0002234Iterator.class);
			pageContext.getOut().print(theDateTimeValueRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

