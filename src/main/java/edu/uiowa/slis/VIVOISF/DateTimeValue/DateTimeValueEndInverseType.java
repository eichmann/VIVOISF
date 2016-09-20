package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueEndInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueEndInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueEndInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueEndInverseIterator theDateTimeValueEndInverseIterator = (DateTimeValueEndInverseIterator)findAncestorWithClass(this, DateTimeValueEndInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueEndInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for end tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for end tag ");
		}
		return SKIP_BODY;
	}
}

