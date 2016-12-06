package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasURLIterator theSlideshowHasURLIterator = (SlideshowHasURLIterator)findAncestorWithClass(this, SlideshowHasURLIterator.class);
			pageContext.getOut().print(theSlideshowHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

