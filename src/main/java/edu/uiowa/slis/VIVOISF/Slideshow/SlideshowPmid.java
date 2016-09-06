package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowPmidIterator theSlideshow = (SlideshowPmidIterator)findAncestorWithClass(this, SlideshowPmidIterator.class);
			pageContext.getOut().print(theSlideshow.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for pmid tag ");
		}
		return SKIP_BODY;
	}
}

