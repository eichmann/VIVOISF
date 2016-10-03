package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterIsbn13Iterator theNewsletter = (NewsletterIsbn13Iterator)findAncestorWithClass(this, NewsletterIsbn13Iterator.class);
			pageContext.getOut().print(theNewsletter.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

