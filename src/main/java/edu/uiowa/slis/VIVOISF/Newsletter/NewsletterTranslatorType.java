package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterTranslatorIterator theNewsletterTranslatorIterator = (NewsletterTranslatorIterator)findAncestorWithClass(this, NewsletterTranslatorIterator.class);
			pageContext.getOut().print(theNewsletterTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for translator tag ");
		}
		return SKIP_BODY;
	}
}

