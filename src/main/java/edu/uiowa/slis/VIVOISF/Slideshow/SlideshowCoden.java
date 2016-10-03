package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodenIterator theSlideshow = (SlideshowCodenIterator)findAncestorWithClass(this, SlideshowCodenIterator.class);
			pageContext.getOut().print(theSlideshow.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for coden tag ");
		}
		return SKIP_BODY;
	}
}

