package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowAgriculturalAreaTotalIterator theSlideshow = (SlideshowAgriculturalAreaTotalIterator)findAncestorWithClass(this, SlideshowAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theSlideshow.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

