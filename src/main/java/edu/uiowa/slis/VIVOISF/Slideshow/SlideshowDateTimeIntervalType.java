package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowDateTimeIntervalIterator theSlideshowDateTimeIntervalIterator = (SlideshowDateTimeIntervalIterator)findAncestorWithClass(this, SlideshowDateTimeIntervalIterator.class);
			pageContext.getOut().print(theSlideshowDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

