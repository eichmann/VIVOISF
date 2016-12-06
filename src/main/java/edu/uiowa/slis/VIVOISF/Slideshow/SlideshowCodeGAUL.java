package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeGAULIterator theSlideshow = (SlideshowCodeGAULIterator)findAncestorWithClass(this, SlideshowCodeGAULIterator.class);
			pageContext.getOut().print(theSlideshow.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

