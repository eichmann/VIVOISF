package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterFeaturesIterator theNewsletterFeaturesIterator = (NewsletterFeaturesIterator)findAncestorWithClass(this, NewsletterFeaturesIterator.class);
			pageContext.getOut().print(theNewsletterFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for features tag ");
		}
		return SKIP_BODY;
	}
}

