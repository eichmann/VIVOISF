package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterRelatedByIterator theNewsletterRelatedByIterator = (NewsletterRelatedByIterator)findAncestorWithClass(this, NewsletterRelatedByIterator.class);
			pageContext.getOut().print(theNewsletterRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

