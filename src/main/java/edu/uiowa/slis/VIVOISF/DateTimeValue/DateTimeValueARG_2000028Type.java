package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueARG_2000028Iterator theDateTimeValueARG_2000028Iterator = (DateTimeValueARG_2000028Iterator)findAncestorWithClass(this, DateTimeValueARG_2000028Iterator.class);
			pageContext.getOut().print(theDateTimeValueARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

