package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowARG_0000001Iterator theSlideshow = (SlideshowARG_0000001Iterator)findAncestorWithClass(this, SlideshowARG_0000001Iterator.class);
			pageContext.getOut().print(theSlideshow.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

