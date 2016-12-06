package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDateTimeIntervalIterator theConferencePaperDateTimeIntervalIterator = (ConferencePaperDateTimeIntervalIterator)findAncestorWithClass(this, ConferencePaperDateTimeIntervalIterator.class);
			pageContext.getOut().print(theConferencePaperDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

