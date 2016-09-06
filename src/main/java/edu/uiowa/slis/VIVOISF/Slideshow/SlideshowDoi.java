package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowDoiIterator theSlideshow = (SlideshowDoiIterator)findAncestorWithClass(this, SlideshowDoiIterator.class);
			pageContext.getOut().print(theSlideshow.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for doi tag ");
		}
		return SKIP_BODY;
	}
}

