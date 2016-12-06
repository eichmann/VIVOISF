package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023DateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023DateTimeIntervalIterator theBFO_0000023DateTimeIntervalIterator = (BFO_0000023DateTimeIntervalIterator)findAncestorWithClass(this, BFO_0000023DateTimeIntervalIterator.class);
			pageContext.getOut().print(theBFO_0000023DateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

