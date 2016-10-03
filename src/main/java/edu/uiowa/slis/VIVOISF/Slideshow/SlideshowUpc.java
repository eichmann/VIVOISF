package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowUpcIterator theSlideshow = (SlideshowUpcIterator)findAncestorWithClass(this, SlideshowUpcIterator.class);
			pageContext.getOut().print(theSlideshow.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for upc tag ");
		}
		return SKIP_BODY;
	}
}

