package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherPrefixNameIterator thePublisher = (PublisherPrefixNameIterator)findAncestorWithClass(this, PublisherPrefixNameIterator.class);
			pageContext.getOut().print(thePublisher.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

