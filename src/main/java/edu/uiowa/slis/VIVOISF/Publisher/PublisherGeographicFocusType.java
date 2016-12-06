package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherGeographicFocusIterator thePublisherGeographicFocusIterator = (PublisherGeographicFocusIterator)findAncestorWithClass(this, PublisherGeographicFocusIterator.class);
			pageContext.getOut().print(thePublisherGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

