package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPageStartIterator theSlideshow = (SlideshowPageStartIterator)findAncestorWithClass(this, SlideshowPageStartIterator.class);
			pageContext.getOut().print(theSlideshow.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

