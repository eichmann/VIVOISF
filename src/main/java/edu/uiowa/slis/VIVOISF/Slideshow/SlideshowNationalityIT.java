package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNationalityITIterator theSlideshow = (SlideshowNationalityITIterator)findAncestorWithClass(this, SlideshowNationalityITIterator.class);
			pageContext.getOut().print(theSlideshow.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

