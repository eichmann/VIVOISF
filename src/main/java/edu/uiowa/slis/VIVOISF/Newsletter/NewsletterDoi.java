package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterDoiIterator theNewsletter = (NewsletterDoiIterator)findAncestorWithClass(this, NewsletterDoiIterator.class);
			pageContext.getOut().print(theNewsletter.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for doi tag ");
		}
		return SKIP_BODY;
	}
}

