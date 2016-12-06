package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialITIterator theSlideshow = (SlideshowNameOfficialITIterator)findAncestorWithClass(this, SlideshowNameOfficialITIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

