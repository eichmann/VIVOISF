package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHDINotesIterator theSlideshow = (SlideshowHDINotesIterator)findAncestorWithClass(this, SlideshowHDINotesIterator.class);
			pageContext.getOut().print(theSlideshow.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

