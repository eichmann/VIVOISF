package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasURLIterator thePublisherHasURLIterator = (PublisherHasURLIterator)findAncestorWithClass(this, PublisherHasURLIterator.class);
			pageContext.getOut().print(thePublisherHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

