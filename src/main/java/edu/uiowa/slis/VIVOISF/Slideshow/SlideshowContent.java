package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowContent currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowContentIterator theSlideshow = (SlideshowContentIterator)findAncestorWithClass(this, SlideshowContentIterator.class);
			pageContext.getOut().print(theSlideshow.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for content tag ");
		}
		return SKIP_BODY;
	}
}

