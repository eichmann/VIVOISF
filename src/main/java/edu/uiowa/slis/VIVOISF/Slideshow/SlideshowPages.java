package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPages currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPagesIterator theSlideshow = (SlideshowPagesIterator)findAncestorWithClass(this, SlideshowPagesIterator.class);
			pageContext.getOut().print(theSlideshow.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for pages tag ");
		}
		return SKIP_BODY;
	}
}

