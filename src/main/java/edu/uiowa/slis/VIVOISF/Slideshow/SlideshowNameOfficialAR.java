package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialARIterator theSlideshow = (SlideshowNameOfficialARIterator)findAncestorWithClass(this, SlideshowNameOfficialARIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

