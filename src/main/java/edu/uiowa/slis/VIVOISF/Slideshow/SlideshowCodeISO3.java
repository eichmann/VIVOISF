package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeISO3Iterator theSlideshow = (SlideshowCodeISO3Iterator)findAncestorWithClass(this, SlideshowCodeISO3Iterator.class);
			pageContext.getOut().print(theSlideshow.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

