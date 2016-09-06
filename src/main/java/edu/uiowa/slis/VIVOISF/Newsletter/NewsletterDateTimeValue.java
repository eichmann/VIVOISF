package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterDateTimeValueIterator theNewsletterDateTimeValueIterator = (NewsletterDateTimeValueIterator)findAncestorWithClass(this, NewsletterDateTimeValueIterator.class);
			pageContext.getOut().print(theNewsletterDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

