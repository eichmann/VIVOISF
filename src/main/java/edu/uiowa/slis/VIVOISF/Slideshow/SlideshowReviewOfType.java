package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowReviewOfIterator theSlideshowReviewOfIterator = (SlideshowReviewOfIterator)findAncestorWithClass(this, SlideshowReviewOfIterator.class);
			pageContext.getOut().print(theSlideshowReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

