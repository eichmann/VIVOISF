package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNumPagesIterator theSlideshow = (SlideshowNumPagesIterator)findAncestorWithClass(this, SlideshowNumPagesIterator.class);
			pageContext.getOut().print(theSlideshow.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for numPages tag ");
		}
		return SKIP_BODY;
	}
}

