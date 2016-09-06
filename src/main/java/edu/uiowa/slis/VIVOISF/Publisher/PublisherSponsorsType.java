package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherSponsorsIterator thePublisherSponsorsIterator = (PublisherSponsorsIterator)findAncestorWithClass(this, PublisherSponsorsIterator.class);
			pageContext.getOut().print(thePublisherSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

