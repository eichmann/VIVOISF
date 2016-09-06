package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsletterTheAbstractIterator theNewsletter = (NewsletterTheAbstractIterator)findAncestorWithClass(this, NewsletterTheAbstractIterator.class);
			pageContext.getOut().print(theNewsletter.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

