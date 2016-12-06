package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowAgriculturalAreaYearIterator theSlideshow = (SlideshowAgriculturalAreaYearIterator)findAncestorWithClass(this, SlideshowAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theSlideshow.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

