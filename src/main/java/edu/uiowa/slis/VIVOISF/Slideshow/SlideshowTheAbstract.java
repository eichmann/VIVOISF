package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowTheAbstractIterator theSlideshow = (SlideshowTheAbstractIterator)findAncestorWithClass(this, SlideshowTheAbstractIterator.class);
			pageContext.getOut().print(theSlideshow.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

