package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherAgriculturalAreaNotesIterator thePublisher = (PublisherAgriculturalAreaNotesIterator)findAncestorWithClass(this, PublisherAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePublisher.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

