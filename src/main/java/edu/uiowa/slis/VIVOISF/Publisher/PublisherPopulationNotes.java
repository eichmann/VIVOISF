package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherPopulationNotesIterator thePublisher = (PublisherPopulationNotesIterator)findAncestorWithClass(this, PublisherPopulationNotesIterator.class);
			pageContext.getOut().print(thePublisher.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

