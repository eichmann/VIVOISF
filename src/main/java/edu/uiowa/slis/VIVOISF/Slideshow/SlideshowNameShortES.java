package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameShortESIterator theSlideshow = (SlideshowNameShortESIterator)findAncestorWithClass(this, SlideshowNameShortESIterator.class);
			pageContext.getOut().print(theSlideshow.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

