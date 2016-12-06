package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListRUIterator theSlideshow = (SlideshowNameListRUIterator)findAncestorWithClass(this, SlideshowNameListRUIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

