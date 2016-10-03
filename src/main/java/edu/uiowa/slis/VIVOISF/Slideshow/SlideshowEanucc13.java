package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowEanucc13Iterator theSlideshow = (SlideshowEanucc13Iterator)findAncestorWithClass(this, SlideshowEanucc13Iterator.class);
			pageContext.getOut().print(theSlideshow.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

