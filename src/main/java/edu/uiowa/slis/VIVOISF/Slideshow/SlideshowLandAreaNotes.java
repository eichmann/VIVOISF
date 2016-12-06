package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowLandAreaNotesIterator theSlideshow = (SlideshowLandAreaNotesIterator)findAncestorWithClass(this, SlideshowLandAreaNotesIterator.class);
			pageContext.getOut().print(theSlideshow.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

