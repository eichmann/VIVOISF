package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPageEndIterator theSlideshow = (SlideshowPageEndIterator)findAncestorWithClass(this, SlideshowPageEndIterator.class);
			pageContext.getOut().print(theSlideshow.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

