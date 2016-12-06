package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowFreetextKeywordIterator theSlideshow = (SlideshowFreetextKeywordIterator)findAncestorWithClass(this, SlideshowFreetextKeywordIterator.class);
			pageContext.getOut().print(theSlideshow.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

