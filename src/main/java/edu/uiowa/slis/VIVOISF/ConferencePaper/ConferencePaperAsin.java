package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAsinIterator theConferencePaper = (ConferencePaperAsinIterator)findAncestorWithClass(this, ConferencePaperAsinIterator.class);
			pageContext.getOut().print(theConferencePaper.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for asin tag ");
		}
		return SKIP_BODY;
	}
}

