package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateFiledInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateFiledInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateFiledInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateFiledInverseIterator theDateTimeValueDateFiledInverseIterator = (DateTimeValueDateFiledInverseIterator)findAncestorWithClass(this, DateTimeValueDateFiledInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueDateFiledInverseIterator.getDateFiledInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateFiled tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateFiled tag ");
		}
		return SKIP_BODY;
	}
}

