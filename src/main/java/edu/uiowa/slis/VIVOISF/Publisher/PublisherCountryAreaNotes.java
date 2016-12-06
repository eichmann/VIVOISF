package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCountryAreaNotesIterator thePublisher = (PublisherCountryAreaNotesIterator)findAncestorWithClass(this, PublisherCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePublisher.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

