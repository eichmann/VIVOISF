package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherLandAreaNotesIterator thePublisher = (PublisherLandAreaNotesIterator)findAncestorWithClass(this, PublisherLandAreaNotesIterator.class);
			pageContext.getOut().print(thePublisher.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

