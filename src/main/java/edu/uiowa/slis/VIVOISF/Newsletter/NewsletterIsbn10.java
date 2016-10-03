package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterIsbn10Iterator theNewsletter = (NewsletterIsbn10Iterator)findAncestorWithClass(this, NewsletterIsbn10Iterator.class);
			pageContext.getOut().print(theNewsletter.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

