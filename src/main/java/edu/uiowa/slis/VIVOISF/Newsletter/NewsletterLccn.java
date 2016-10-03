package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterLccnIterator theNewsletter = (NewsletterLccnIterator)findAncestorWithClass(this, NewsletterLccnIterator.class);
			pageContext.getOut().print(theNewsletter.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for lccn tag ");
		}
		return SKIP_BODY;
	}
}

