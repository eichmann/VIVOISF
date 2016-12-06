package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowGDPYearIterator theSlideshow = (SlideshowGDPYearIterator)findAncestorWithClass(this, SlideshowGDPYearIterator.class);
			pageContext.getOut().print(theSlideshow.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

