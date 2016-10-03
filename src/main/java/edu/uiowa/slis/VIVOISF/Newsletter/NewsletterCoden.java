package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterCodenIterator theNewsletter = (NewsletterCodenIterator)findAncestorWithClass(this, NewsletterCodenIterator.class);
			pageContext.getOut().print(theNewsletter.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for coden tag ");
		}
		return SKIP_BODY;
	}
}

