package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowERO_0000045Iterator theSlideshow = (SlideshowERO_0000045Iterator)findAncestorWithClass(this, SlideshowERO_0000045Iterator.class);
			pageContext.getOut().print(theSlideshow.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

