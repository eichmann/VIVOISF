package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterRO_0002353Iterator theNewsletterRO_0002353Iterator = (NewsletterRO_0002353Iterator)findAncestorWithClass(this, NewsletterRO_0002353Iterator.class);
			pageContext.getOut().print(theNewsletterRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

