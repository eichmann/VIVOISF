package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAsinIterator theConferencePoster = (ConferencePosterAsinIterator)findAncestorWithClass(this, ConferencePosterAsinIterator.class);
			pageContext.getOut().print(theConferencePoster.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for asin tag ");
		}
		return SKIP_BODY;
	}
}

