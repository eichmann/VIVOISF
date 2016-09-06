package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowStatusIterator theSlideshowStatusIterator = (SlideshowStatusIterator)findAncestorWithClass(this, SlideshowStatusIterator.class);
			pageContext.getOut().print(theSlideshowStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for status tag ");
		}
		return SKIP_BODY;
	}
}

