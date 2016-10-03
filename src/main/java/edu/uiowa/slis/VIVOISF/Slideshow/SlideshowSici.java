package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowSici currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowSiciIterator theSlideshow = (SlideshowSiciIterator)findAncestorWithClass(this, SlideshowSiciIterator.class);
			pageContext.getOut().print(theSlideshow.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for sici tag ");
		}
		return SKIP_BODY;
	}
}

