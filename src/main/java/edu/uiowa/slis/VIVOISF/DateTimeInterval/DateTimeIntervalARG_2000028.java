package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalARG_2000028Iterator theDateTimeIntervalARG_2000028Iterator = (DateTimeIntervalARG_2000028Iterator)findAncestorWithClass(this, DateTimeIntervalARG_2000028Iterator.class);
			pageContext.getOut().print(theDateTimeIntervalARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

