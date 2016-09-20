package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueEndInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueEndInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueEndInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueEndInverseIterator theDateTimeValueEndInverseIterator = (DateTimeValueEndInverseIterator)findAncestorWithClass(this, DateTimeValueEndInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueEndInverseIterator.getEndInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for end tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for end tag ");
		}
		return SKIP_BODY;
	}
}

