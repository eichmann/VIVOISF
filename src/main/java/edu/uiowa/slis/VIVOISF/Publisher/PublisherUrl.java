package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherUrlIterator thePublisher = (PublisherUrlIterator)findAncestorWithClass(this, PublisherUrlIterator.class);
			pageContext.getOut().print(thePublisher.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for url tag ");
		}
		return SKIP_BODY;
	}
}

