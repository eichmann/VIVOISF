package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherDescriptionIterator thePublisher = (PublisherDescriptionIterator)findAncestorWithClass(this, PublisherDescriptionIterator.class);
			pageContext.getOut().print(thePublisher.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for description tag ");
		}
		return SKIP_BODY;
	}
}

