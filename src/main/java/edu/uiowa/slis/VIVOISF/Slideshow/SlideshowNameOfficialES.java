package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialESIterator theSlideshow = (SlideshowNameOfficialESIterator)findAncestorWithClass(this, SlideshowNameOfficialESIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

