package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperUrlIterator theConferencePaper = (ConferencePaperUrlIterator)findAncestorWithClass(this, ConferencePaperUrlIterator.class);
			pageContext.getOut().print(theConferencePaper.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for url tag ");
		}
		return SKIP_BODY;
	}
}

