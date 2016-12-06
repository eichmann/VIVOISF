package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterUrlIterator theConferencePoster = (ConferencePosterUrlIterator)findAncestorWithClass(this, ConferencePosterUrlIterator.class);
			pageContext.getOut().print(theConferencePoster.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for url tag ");
		}
		return SKIP_BODY;
	}
}

