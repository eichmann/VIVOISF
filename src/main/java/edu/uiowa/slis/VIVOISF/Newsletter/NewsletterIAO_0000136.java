package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterIAO_0000136Iterator theNewsletterIAO_0000136Iterator = (NewsletterIAO_0000136Iterator)findAncestorWithClass(this, NewsletterIAO_0000136Iterator.class);
			pageContext.getOut().print(theNewsletterIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

