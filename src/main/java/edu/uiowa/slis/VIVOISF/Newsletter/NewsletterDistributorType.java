package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterDistributorIterator theNewsletterDistributorIterator = (NewsletterDistributorIterator)findAncestorWithClass(this, NewsletterDistributorIterator.class);
			pageContext.getOut().print(theNewsletterDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for distributor tag ");
		}
		return SKIP_BODY;
	}
}

