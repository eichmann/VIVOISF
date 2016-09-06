package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowReproducesIterator theSlideshowReproducesIterator = (SlideshowReproducesIterator)findAncestorWithClass(this, SlideshowReproducesIterator.class);
			pageContext.getOut().print(theSlideshowReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

