package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeISO2Iterator theSlideshow = (SlideshowCodeISO2Iterator)findAncestorWithClass(this, SlideshowCodeISO2Iterator.class);
			pageContext.getOut().print(theSlideshow.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

