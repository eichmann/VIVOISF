package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCountryAreaYearIterator theSlideshow = (SlideshowCountryAreaYearIterator)findAncestorWithClass(this, SlideshowCountryAreaYearIterator.class);
			pageContext.getOut().print(theSlideshow.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

