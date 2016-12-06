package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialZHIterator theSlideshow = (SlideshowNameOfficialZHIterator)findAncestorWithClass(this, SlideshowNameOfficialZHIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

