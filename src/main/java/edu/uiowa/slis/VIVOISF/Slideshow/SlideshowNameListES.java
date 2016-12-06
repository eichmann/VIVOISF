package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListESIterator theSlideshow = (SlideshowNameListESIterator)findAncestorWithClass(this, SlideshowNameListESIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

