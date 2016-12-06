package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialRUIterator theSlideshow = (SlideshowNameOfficialRUIterator)findAncestorWithClass(this, SlideshowNameOfficialRUIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

