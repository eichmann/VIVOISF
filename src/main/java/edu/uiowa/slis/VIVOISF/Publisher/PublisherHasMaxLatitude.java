package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherHasMaxLatitudeIterator thePublisher = (PublisherHasMaxLatitudeIterator)findAncestorWithClass(this, PublisherHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePublisher.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

