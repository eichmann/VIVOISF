package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListENIterator theSlideshow = (SlideshowNameListENIterator)findAncestorWithClass(this, SlideshowNameListENIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

