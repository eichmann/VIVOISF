package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateFiledInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateFiledInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateFiledInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateFiledInverseIterator theDateTimeValueDateFiledInverseIterator = (DateTimeValueDateFiledInverseIterator)findAncestorWithClass(this, DateTimeValueDateFiledInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueDateFiledInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateFiled tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateFiled tag ");
		}
		return SKIP_BODY;
	}
}

