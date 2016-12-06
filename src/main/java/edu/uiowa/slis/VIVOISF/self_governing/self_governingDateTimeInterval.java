package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingDateTimeIntervalIterator theself_governingDateTimeIntervalIterator = (self_governingDateTimeIntervalIterator)findAncestorWithClass(this, self_governingDateTimeIntervalIterator.class);
			pageContext.getOut().print(theself_governingDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

