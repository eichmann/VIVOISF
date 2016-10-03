package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterEissnIterator theNewsletter = (NewsletterEissnIterator)findAncestorWithClass(this, NewsletterEissnIterator.class);
			pageContext.getOut().print(theNewsletter.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for eissn tag ");
		}
		return SKIP_BODY;
	}
}

