package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherLandAreaYearIterator thePublisher = (PublisherLandAreaYearIterator)findAncestorWithClass(this, PublisherLandAreaYearIterator.class);
			pageContext.getOut().print(thePublisher.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

