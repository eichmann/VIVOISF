package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterHandleIterator theNewsletter = (NewsletterHandleIterator)findAncestorWithClass(this, NewsletterHandleIterator.class);
			pageContext.getOut().print(theNewsletter.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for handle tag ");
		}
		return SKIP_BODY;
	}
}

