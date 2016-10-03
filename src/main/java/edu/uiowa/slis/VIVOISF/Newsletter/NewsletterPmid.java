package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterPmidIterator theNewsletter = (NewsletterPmidIterator)findAncestorWithClass(this, NewsletterPmidIterator.class);
			pageContext.getOut().print(theNewsletter.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for pmid tag ");
		}
		return SKIP_BODY;
	}
}

