package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterRO_0000056Iterator theNewsletterRO_0000056Iterator = (NewsletterRO_0000056Iterator)findAncestorWithClass(this, NewsletterRO_0000056Iterator.class);
			pageContext.getOut().print(theNewsletterRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

