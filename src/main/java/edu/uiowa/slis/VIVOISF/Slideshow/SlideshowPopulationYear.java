package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPopulationYearIterator theSlideshow = (SlideshowPopulationYearIterator)findAncestorWithClass(this, SlideshowPopulationYearIterator.class);
			pageContext.getOut().print(theSlideshow.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

