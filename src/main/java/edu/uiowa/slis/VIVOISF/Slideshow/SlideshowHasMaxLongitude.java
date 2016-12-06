package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasMaxLongitudeIterator theSlideshow = (SlideshowHasMaxLongitudeIterator)findAncestorWithClass(this, SlideshowHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theSlideshow.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

