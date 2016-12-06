package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowUrlIterator theSlideshow = (SlideshowUrlIterator)findAncestorWithClass(this, SlideshowUrlIterator.class);
			pageContext.getOut().print(theSlideshow.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for url tag ");
		}
		return SKIP_BODY;
	}
}

