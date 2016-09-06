package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowCitedByIterator theSlideshowCitedByIterator = (SlideshowCitedByIterator)findAncestorWithClass(this, SlideshowCitedByIterator.class);
			pageContext.getOut().print(theSlideshowCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

