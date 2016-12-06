package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowAgriculturalAreaUnitIterator theSlideshow = (SlideshowAgriculturalAreaUnitIterator)findAncestorWithClass(this, SlideshowAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theSlideshow.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

