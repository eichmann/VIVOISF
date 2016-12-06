package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherHasMinLongitudeIterator thePublisher = (PublisherHasMinLongitudeIterator)findAncestorWithClass(this, PublisherHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePublisher.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

