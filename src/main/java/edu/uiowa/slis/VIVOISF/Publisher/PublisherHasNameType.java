package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasNameIterator thePublisherHasNameIterator = (PublisherHasNameIterator)findAncestorWithClass(this, PublisherHasNameIterator.class);
			pageContext.getOut().print(thePublisherHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasName tag ");
		}
		return SKIP_BODY;
	}
}

