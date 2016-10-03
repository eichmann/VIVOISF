package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherSuffixNameIterator thePublisher = (PublisherSuffixNameIterator)findAncestorWithClass(this, PublisherSuffixNameIterator.class);
			pageContext.getOut().print(thePublisher.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

