package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterIssnIterator theNewsletter = (NewsletterIssnIterator)findAncestorWithClass(this, NewsletterIssnIterator.class);
			pageContext.getOut().print(theNewsletter.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for issn tag ");
		}
		return SKIP_BODY;
	}
}

