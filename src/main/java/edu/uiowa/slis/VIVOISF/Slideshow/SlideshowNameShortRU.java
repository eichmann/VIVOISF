package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameShortRUIterator theSlideshow = (SlideshowNameShortRUIterator)findAncestorWithClass(this, SlideshowNameShortRUIterator.class);
			pageContext.getOut().print(theSlideshow.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

