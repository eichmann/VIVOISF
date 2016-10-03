package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowIdentifierIterator theSlideshow = (SlideshowIdentifierIterator)findAncestorWithClass(this, SlideshowIdentifierIterator.class);
			pageContext.getOut().print(theSlideshow.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for identifier tag ");
		}
		return SKIP_BODY;
	}
}

