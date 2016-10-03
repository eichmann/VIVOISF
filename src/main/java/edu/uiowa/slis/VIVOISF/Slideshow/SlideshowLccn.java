package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowLccnIterator theSlideshow = (SlideshowLccnIterator)findAncestorWithClass(this, SlideshowLccnIterator.class);
			pageContext.getOut().print(theSlideshow.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for lccn tag ");
		}
		return SKIP_BODY;
	}
}

