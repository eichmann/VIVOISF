package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowGtin14Iterator theSlideshow = (SlideshowGtin14Iterator)findAncestorWithClass(this, SlideshowGtin14Iterator.class);
			pageContext.getOut().print(theSlideshow.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

