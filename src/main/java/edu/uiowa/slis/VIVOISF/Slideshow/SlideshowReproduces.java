package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowReproducesIterator theSlideshowReproducesIterator = (SlideshowReproducesIterator)findAncestorWithClass(this, SlideshowReproducesIterator.class);
			pageContext.getOut().print(theSlideshowReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

