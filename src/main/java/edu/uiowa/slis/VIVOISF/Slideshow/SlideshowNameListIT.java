package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListITIterator theSlideshow = (SlideshowNameListITIterator)findAncestorWithClass(this, SlideshowNameListITIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

