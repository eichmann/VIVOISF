package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002DateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002DateTimeIntervalIterator theBFO_0000002DateTimeIntervalIterator = (BFO_0000002DateTimeIntervalIterator)findAncestorWithClass(this, BFO_0000002DateTimeIntervalIterator.class);
			pageContext.getOut().print(theBFO_0000002DateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

