package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterIssuerIterator theNewsletterIssuerIterator = (NewsletterIssuerIterator)findAncestorWithClass(this, NewsletterIssuerIterator.class);
			pageContext.getOut().print(theNewsletterIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

