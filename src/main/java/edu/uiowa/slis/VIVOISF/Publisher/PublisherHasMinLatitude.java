package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherHasMinLatitudeIterator thePublisher = (PublisherHasMinLatitudeIterator)findAncestorWithClass(this, PublisherHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePublisher.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

