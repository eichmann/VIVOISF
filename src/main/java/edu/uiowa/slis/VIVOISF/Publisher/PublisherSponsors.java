package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherSponsorsIterator thePublisherSponsorsIterator = (PublisherSponsorsIterator)findAncestorWithClass(this, PublisherSponsorsIterator.class);
			pageContext.getOut().print(thePublisherSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

