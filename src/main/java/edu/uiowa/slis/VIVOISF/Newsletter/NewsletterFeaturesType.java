package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterFeaturesIterator theNewsletterFeaturesIterator = (NewsletterFeaturesIterator)findAncestorWithClass(this, NewsletterFeaturesIterator.class);
			pageContext.getOut().print(theNewsletterFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for features tag ");
		}
		return SKIP_BODY;
	}
}

