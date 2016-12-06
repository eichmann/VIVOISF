package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasAddressIterator thePublisherHasAddressIterator = (PublisherHasAddressIterator)findAncestorWithClass(this, PublisherHasAddressIterator.class);
			pageContext.getOut().print(thePublisherHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

