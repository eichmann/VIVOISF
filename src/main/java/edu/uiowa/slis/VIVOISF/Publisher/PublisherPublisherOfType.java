package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPublisherOfIterator thePublisherPublisherOfIterator = (PublisherPublisherOfIterator)findAncestorWithClass(this, PublisherPublisherOfIterator.class);
			pageContext.getOut().print(thePublisherPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

