package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterEanucc13Iterator theNewsletter = (NewsletterEanucc13Iterator)findAncestorWithClass(this, NewsletterEanucc13Iterator.class);
			pageContext.getOut().print(theNewsletter.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

