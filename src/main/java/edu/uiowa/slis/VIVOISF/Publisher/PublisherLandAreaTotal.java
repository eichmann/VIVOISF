package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherLandAreaTotalIterator thePublisher = (PublisherLandAreaTotalIterator)findAncestorWithClass(this, PublisherLandAreaTotalIterator.class);
			pageContext.getOut().print(thePublisher.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

