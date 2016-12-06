package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowGeographicFocusIterator theSlideshowGeographicFocusIterator = (SlideshowGeographicFocusIterator)findAncestorWithClass(this, SlideshowGeographicFocusIterator.class);
			pageContext.getOut().print(theSlideshowGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

