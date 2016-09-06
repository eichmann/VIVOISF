package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowVolumeIterator theSlideshow = (SlideshowVolumeIterator)findAncestorWithClass(this, SlideshowVolumeIterator.class);
			pageContext.getOut().print(theSlideshow.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for volume tag ");
		}
		return SKIP_BODY;
	}
}

