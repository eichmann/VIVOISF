package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNumberIterator theSlideshow = (SlideshowNumberIterator)findAncestorWithClass(this, SlideshowNumberIterator.class);
			pageContext.getOut().print(theSlideshow.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for number tag ");
		}
		return SKIP_BODY;
	}
}

