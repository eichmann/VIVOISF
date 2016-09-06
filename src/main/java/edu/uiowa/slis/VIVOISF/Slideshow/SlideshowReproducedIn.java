package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowReproducedInIterator theSlideshowReproducedInIterator = (SlideshowReproducedInIterator)findAncestorWithClass(this, SlideshowReproducedInIterator.class);
			pageContext.getOut().print(theSlideshowReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

