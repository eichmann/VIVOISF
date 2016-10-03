package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterIssuerIterator theNewsletterIssuerIterator = (NewsletterIssuerIterator)findAncestorWithClass(this, NewsletterIssuerIterator.class);
			pageContext.getOut().print(theNewsletterIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

