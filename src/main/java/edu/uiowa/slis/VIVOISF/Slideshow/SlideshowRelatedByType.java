package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRelatedByIterator theSlideshowRelatedByIterator = (SlideshowRelatedByIterator)findAncestorWithClass(this, SlideshowRelatedByIterator.class);
			pageContext.getOut().print(theSlideshowRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

