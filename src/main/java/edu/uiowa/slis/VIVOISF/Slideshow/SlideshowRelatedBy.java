package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRelatedByIterator theSlideshowRelatedByIterator = (SlideshowRelatedByIterator)findAncestorWithClass(this, SlideshowRelatedByIterator.class);
			pageContext.getOut().print(theSlideshowRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

