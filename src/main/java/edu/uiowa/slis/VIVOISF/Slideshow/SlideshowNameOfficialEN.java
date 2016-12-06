package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameOfficialENIterator theSlideshow = (SlideshowNameOfficialENIterator)findAncestorWithClass(this, SlideshowNameOfficialENIterator.class);
			pageContext.getOut().print(theSlideshow.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

