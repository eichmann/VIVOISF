package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListARIterator theSlideshow = (SlideshowNameListARIterator)findAncestorWithClass(this, SlideshowNameListARIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

