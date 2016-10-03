package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowOclcnumIterator theSlideshow = (SlideshowOclcnumIterator)findAncestorWithClass(this, SlideshowOclcnumIterator.class);
			pageContext.getOut().print(theSlideshow.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

