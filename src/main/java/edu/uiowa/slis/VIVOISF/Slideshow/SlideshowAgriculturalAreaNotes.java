package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowAgriculturalAreaNotesIterator theSlideshow = (SlideshowAgriculturalAreaNotesIterator)findAncestorWithClass(this, SlideshowAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theSlideshow.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

