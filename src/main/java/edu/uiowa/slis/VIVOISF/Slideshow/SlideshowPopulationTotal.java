package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPopulationTotalIterator theSlideshow = (SlideshowPopulationTotalIterator)findAncestorWithClass(this, SlideshowPopulationTotalIterator.class);
			pageContext.getOut().print(theSlideshow.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

