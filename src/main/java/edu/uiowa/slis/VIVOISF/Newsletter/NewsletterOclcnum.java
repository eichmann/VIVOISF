package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterOclcnumIterator theNewsletter = (NewsletterOclcnumIterator)findAncestorWithClass(this, NewsletterOclcnumIterator.class);
			pageContext.getOut().print(theNewsletter.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

