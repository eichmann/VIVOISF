package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPopulationNotesIterator theSlideshow = (SlideshowPopulationNotesIterator)findAncestorWithClass(this, SlideshowPopulationNotesIterator.class);
			pageContext.getOut().print(theSlideshow.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

