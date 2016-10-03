package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowIsbn13Iterator theSlideshow = (SlideshowIsbn13Iterator)findAncestorWithClass(this, SlideshowIsbn13Iterator.class);
			pageContext.getOut().print(theSlideshow.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

