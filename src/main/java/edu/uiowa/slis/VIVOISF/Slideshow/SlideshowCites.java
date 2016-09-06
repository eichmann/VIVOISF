package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCites currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowCitesIterator theSlideshowCitesIterator = (SlideshowCitesIterator)findAncestorWithClass(this, SlideshowCitesIterator.class);
			pageContext.getOut().print(theSlideshowCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for cites tag ");
		}
		return SKIP_BODY;
	}
}

