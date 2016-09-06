package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowReproducedInIterator theSlideshowReproducedInIterator = (SlideshowReproducedInIterator)findAncestorWithClass(this, SlideshowReproducedInIterator.class);
			pageContext.getOut().print(theSlideshowReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

