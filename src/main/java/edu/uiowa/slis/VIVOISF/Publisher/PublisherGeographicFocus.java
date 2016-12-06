package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherGeographicFocusIterator thePublisherGeographicFocusIterator = (PublisherGeographicFocusIterator)findAncestorWithClass(this, PublisherGeographicFocusIterator.class);
			pageContext.getOut().print(thePublisherGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

