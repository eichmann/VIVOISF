package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDateTimeValueIterator theConferencePaperDateTimeValueIterator = (ConferencePaperDateTimeValueIterator)findAncestorWithClass(this, ConferencePaperDateTimeValueIterator.class);
			pageContext.getOut().print(theConferencePaperDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

