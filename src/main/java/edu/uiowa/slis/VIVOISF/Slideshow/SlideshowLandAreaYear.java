package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowLandAreaYearIterator theSlideshow = (SlideshowLandAreaYearIterator)findAncestorWithClass(this, SlideshowLandAreaYearIterator.class);
			pageContext.getOut().print(theSlideshow.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

