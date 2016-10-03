package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowHandleIterator theSlideshow = (SlideshowHandleIterator)findAncestorWithClass(this, SlideshowHandleIterator.class);
			pageContext.getOut().print(theSlideshow.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for handle tag ");
		}
		return SKIP_BODY;
	}
}

