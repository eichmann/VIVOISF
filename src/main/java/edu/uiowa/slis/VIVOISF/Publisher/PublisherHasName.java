package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasNameIterator thePublisherHasNameIterator = (PublisherHasNameIterator)findAncestorWithClass(this, PublisherHasNameIterator.class);
			pageContext.getOut().print(thePublisherHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasName tag ");
		}
		return SKIP_BODY;
	}
}

