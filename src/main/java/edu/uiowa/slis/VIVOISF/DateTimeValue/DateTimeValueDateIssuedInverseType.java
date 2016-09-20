package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateIssuedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateIssuedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateIssuedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateIssuedInverseIterator theDateTimeValueDateIssuedInverseIterator = (DateTimeValueDateIssuedInverseIterator)findAncestorWithClass(this, DateTimeValueDateIssuedInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueDateIssuedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateIssued tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateIssued tag ");
		}
		return SKIP_BODY;
	}
}

