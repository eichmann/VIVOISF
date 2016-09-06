package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRelatedByIterator thePublisherRelatedByIterator = (PublisherRelatedByIterator)findAncestorWithClass(this, PublisherRelatedByIterator.class);
			pageContext.getOut().print(thePublisherRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

