package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowLandAreaTotalIterator theSlideshow = (SlideshowLandAreaTotalIterator)findAncestorWithClass(this, SlideshowLandAreaTotalIterator.class);
			pageContext.getOut().print(theSlideshow.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

