package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterSici currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterSiciIterator theNewsletter = (NewsletterSiciIterator)findAncestorWithClass(this, NewsletterSiciIterator.class);
			pageContext.getOut().print(theNewsletter.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for sici tag ");
		}
		return SKIP_BODY;
	}
}

