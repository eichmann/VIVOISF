package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowIsbn10Iterator theSlideshow = (SlideshowIsbn10Iterator)findAncestorWithClass(this, SlideshowIsbn10Iterator.class);
			pageContext.getOut().print(theSlideshow.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

