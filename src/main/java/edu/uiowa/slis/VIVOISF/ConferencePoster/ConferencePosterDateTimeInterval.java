package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDateTimeIntervalIterator theConferencePosterDateTimeIntervalIterator = (ConferencePosterDateTimeIntervalIterator)findAncestorWithClass(this, ConferencePosterDateTimeIntervalIterator.class);
			pageContext.getOut().print(theConferencePosterDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

