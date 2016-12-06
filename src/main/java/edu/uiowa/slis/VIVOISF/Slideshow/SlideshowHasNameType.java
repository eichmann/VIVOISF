package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasNameIterator theSlideshowHasNameIterator = (SlideshowHasNameIterator)findAncestorWithClass(this, SlideshowHasNameIterator.class);
			pageContext.getOut().print(theSlideshowHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasName tag ");
		}
		return SKIP_BODY;
	}
}

