package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCountryAreaNotesIterator theSlideshow = (SlideshowCountryAreaNotesIterator)findAncestorWithClass(this, SlideshowCountryAreaNotesIterator.class);
			pageContext.getOut().print(theSlideshow.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

