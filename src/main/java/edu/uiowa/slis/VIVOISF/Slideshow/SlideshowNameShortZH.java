package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameShortZHIterator theSlideshow = (SlideshowNameShortZHIterator)findAncestorWithClass(this, SlideshowNameShortZHIterator.class);
			pageContext.getOut().print(theSlideshow.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

