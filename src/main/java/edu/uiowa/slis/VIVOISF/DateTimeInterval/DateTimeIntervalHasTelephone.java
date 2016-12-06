package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHasTelephoneIterator theDateTimeIntervalHasTelephoneIterator = (DateTimeIntervalHasTelephoneIterator)findAncestorWithClass(this, DateTimeIntervalHasTelephoneIterator.class);
			pageContext.getOut().print(theDateTimeIntervalHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
