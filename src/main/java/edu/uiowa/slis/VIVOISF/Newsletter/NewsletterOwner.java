package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterOwnerIterator theNewsletterOwnerIterator = (NewsletterOwnerIterator)findAncestorWithClass(this, NewsletterOwnerIterator.class);
			pageContext.getOut().print(theNewsletterOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for owner tag ");
		}
		return SKIP_BODY;
	}
}

