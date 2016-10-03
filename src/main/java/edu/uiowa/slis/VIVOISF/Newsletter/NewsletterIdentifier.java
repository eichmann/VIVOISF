package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterIdentifierIterator theNewsletter = (NewsletterIdentifierIterator)findAncestorWithClass(this, NewsletterIdentifierIterator.class);
			pageContext.getOut().print(theNewsletter.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for identifier tag ");
		}
		return SKIP_BODY;
	}
}

