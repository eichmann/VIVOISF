package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowEditionIterator theSlideshow = (SlideshowEditionIterator)findAncestorWithClass(this, SlideshowEditionIterator.class);
			pageContext.getOut().print(theSlideshow.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for edition tag ");
		}
		return SKIP_BODY;
	}
}

