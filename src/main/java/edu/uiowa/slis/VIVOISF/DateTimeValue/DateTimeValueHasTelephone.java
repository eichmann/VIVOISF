package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHasTelephoneIterator theDateTimeValueHasTelephoneIterator = (DateTimeValueHasTelephoneIterator)findAncestorWithClass(this, DateTimeValueHasTelephoneIterator.class);
			pageContext.getOut().print(theDateTimeValueHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

