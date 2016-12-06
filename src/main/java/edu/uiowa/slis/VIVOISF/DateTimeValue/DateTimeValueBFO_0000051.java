package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueBFO_0000051Iterator theDateTimeValueBFO_0000051Iterator = (DateTimeValueBFO_0000051Iterator)findAncestorWithClass(this, DateTimeValueBFO_0000051Iterator.class);
			pageContext.getOut().print(theDateTimeValueBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

