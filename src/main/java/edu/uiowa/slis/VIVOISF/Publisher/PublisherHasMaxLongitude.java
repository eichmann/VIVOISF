package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherHasMaxLongitudeIterator thePublisher = (PublisherHasMaxLongitudeIterator)findAncestorWithClass(this, PublisherHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePublisher.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

