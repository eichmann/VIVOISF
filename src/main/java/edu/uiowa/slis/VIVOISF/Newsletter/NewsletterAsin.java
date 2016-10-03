package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterAsinIterator theNewsletter = (NewsletterAsinIterator)findAncestorWithClass(this, NewsletterAsinIterator.class);
			pageContext.getOut().print(theNewsletter.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for asin tag ");
		}
		return SKIP_BODY;
	}
}

