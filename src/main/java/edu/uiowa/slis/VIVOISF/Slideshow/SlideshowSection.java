package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowSection currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowSectionIterator theSlideshow = (SlideshowSectionIterator)findAncestorWithClass(this, SlideshowSectionIterator.class);
			pageContext.getOut().print(theSlideshow.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for section tag ");
		}
		return SKIP_BODY;
	}
}

