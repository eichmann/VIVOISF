package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterUpcIterator theNewsletter = (NewsletterUpcIterator)findAncestorWithClass(this, NewsletterUpcIterator.class);
			pageContext.getOut().print(theNewsletter.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for upc tag ");
		}
		return SKIP_BODY;
	}
}

