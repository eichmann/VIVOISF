package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterGtin14Iterator theNewsletter = (NewsletterGtin14Iterator)findAncestorWithClass(this, NewsletterGtin14Iterator.class);
			pageContext.getOut().print(theNewsletter.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

