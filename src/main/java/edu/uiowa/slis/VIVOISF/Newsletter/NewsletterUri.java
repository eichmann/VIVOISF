package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterUri currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterUriIterator theNewsletter = (NewsletterUriIterator)findAncestorWithClass(this, NewsletterUriIterator.class);
			pageContext.getOut().print(theNewsletter.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for uri tag ");
		}
		return SKIP_BODY;
	}
}

