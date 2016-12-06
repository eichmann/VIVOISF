package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeAGROVOCIterator theSlideshow = (SlideshowCodeAGROVOCIterator)findAncestorWithClass(this, SlideshowCodeAGROVOCIterator.class);
			pageContext.getOut().print(theSlideshow.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

