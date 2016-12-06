package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasMaxLatitudeIterator theSlideshow = (SlideshowHasMaxLatitudeIterator)findAncestorWithClass(this, SlideshowHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theSlideshow.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

