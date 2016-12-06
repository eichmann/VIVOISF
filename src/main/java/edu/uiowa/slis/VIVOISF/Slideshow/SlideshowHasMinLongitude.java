package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasMinLongitudeIterator theSlideshow = (SlideshowHasMinLongitudeIterator)findAncestorWithClass(this, SlideshowHasMinLongitudeIterator.class);
			pageContext.getOut().print(theSlideshow.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

