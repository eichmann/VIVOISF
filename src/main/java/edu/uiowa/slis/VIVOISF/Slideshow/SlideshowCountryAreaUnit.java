package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCountryAreaUnitIterator theSlideshow = (SlideshowCountryAreaUnitIterator)findAncestorWithClass(this, SlideshowCountryAreaUnitIterator.class);
			pageContext.getOut().print(theSlideshow.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

