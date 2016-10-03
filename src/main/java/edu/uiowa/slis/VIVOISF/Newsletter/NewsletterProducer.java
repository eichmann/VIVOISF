package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterProducerIterator theNewsletterProducerIterator = (NewsletterProducerIterator)findAncestorWithClass(this, NewsletterProducerIterator.class);
			pageContext.getOut().print(theNewsletterProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for producer tag ");
		}
		return SKIP_BODY;
	}
}

