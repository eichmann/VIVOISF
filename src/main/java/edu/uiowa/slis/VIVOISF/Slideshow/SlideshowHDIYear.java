package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHDIYearIterator theSlideshow = (SlideshowHDIYearIterator)findAncestorWithClass(this, SlideshowHDIYearIterator.class);
			pageContext.getOut().print(theSlideshow.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

