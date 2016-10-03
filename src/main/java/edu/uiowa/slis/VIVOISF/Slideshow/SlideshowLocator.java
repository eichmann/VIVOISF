package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowLocatorIterator theSlideshow = (SlideshowLocatorIterator)findAncestorWithClass(this, SlideshowLocatorIterator.class);
			pageContext.getOut().print(theSlideshow.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for locator tag ");
		}
		return SKIP_BODY;
	}
}

