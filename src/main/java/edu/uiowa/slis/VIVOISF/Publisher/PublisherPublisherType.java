package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPublisherIterator thePublisherPublisherIterator = (PublisherPublisherIterator)findAncestorWithClass(this, PublisherPublisherIterator.class);
			pageContext.getOut().print(thePublisherPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for publisher tag ");
		}
		return SKIP_BODY;
	}
}

