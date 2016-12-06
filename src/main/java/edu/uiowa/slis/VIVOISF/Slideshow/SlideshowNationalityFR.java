package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNationalityFRIterator theSlideshow = (SlideshowNationalityFRIterator)findAncestorWithClass(this, SlideshowNationalityFRIterator.class);
			pageContext.getOut().print(theSlideshow.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

