package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPopulationUnitIterator theSlideshow = (SlideshowPopulationUnitIterator)findAncestorWithClass(this, SlideshowPopulationUnitIterator.class);
			pageContext.getOut().print(theSlideshow.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

