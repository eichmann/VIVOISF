package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherOrganizerInverseIterator thePublisherOrganizerInverseIterator = (PublisherOrganizerInverseIterator)findAncestorWithClass(this, PublisherOrganizerInverseIterator.class);
			pageContext.getOut().print(thePublisherOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for organizer tag ");
		}
		return SKIP_BODY;
	}
}

