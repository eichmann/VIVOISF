package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherGDPNotesIterator thePublisher = (PublisherGDPNotesIterator)findAncestorWithClass(this, PublisherGDPNotesIterator.class);
			pageContext.getOut().print(thePublisher.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

