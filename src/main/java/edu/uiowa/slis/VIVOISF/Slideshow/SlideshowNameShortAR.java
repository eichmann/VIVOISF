package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameShortARIterator theSlideshow = (SlideshowNameShortARIterator)findAncestorWithClass(this, SlideshowNameShortARIterator.class);
			pageContext.getOut().print(theSlideshow.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

