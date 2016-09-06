package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPublisherOfIterator thePublisherPublisherOfIterator = (PublisherPublisherOfIterator)findAncestorWithClass(this, PublisherPublisherOfIterator.class);
			pageContext.getOut().print(thePublisherPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

