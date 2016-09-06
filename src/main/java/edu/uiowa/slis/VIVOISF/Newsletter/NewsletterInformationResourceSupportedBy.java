package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterInformationResourceSupportedByIterator theNewsletterInformationResourceSupportedByIterator = (NewsletterInformationResourceSupportedByIterator)findAncestorWithClass(this, NewsletterInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theNewsletterInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

