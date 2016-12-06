package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowGDPNotesIterator theSlideshow = (SlideshowGDPNotesIterator)findAncestorWithClass(this, SlideshowGDPNotesIterator.class);
			pageContext.getOut().print(theSlideshow.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

