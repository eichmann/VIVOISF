package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameShortITIterator theSlideshow = (SlideshowNameShortITIterator)findAncestorWithClass(this, SlideshowNameShortITIterator.class);
			pageContext.getOut().print(theSlideshow.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

