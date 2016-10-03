package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowOwnerIterator theSlideshowOwnerIterator = (SlideshowOwnerIterator)findAncestorWithClass(this, SlideshowOwnerIterator.class);
			pageContext.getOut().print(theSlideshowOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for owner tag ");
		}
		return SKIP_BODY;
	}
}

