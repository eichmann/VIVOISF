package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasNameIterator theSlideshowHasNameIterator = (SlideshowHasNameIterator)findAncestorWithClass(this, SlideshowHasNameIterator.class);
			pageContext.getOut().print(theSlideshowHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasName tag ");
		}
		return SKIP_BODY;
	}
}

