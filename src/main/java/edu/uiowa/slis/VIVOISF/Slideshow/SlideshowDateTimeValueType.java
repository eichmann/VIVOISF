package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowDateTimeValueIterator theSlideshowDateTimeValueIterator = (SlideshowDateTimeValueIterator)findAncestorWithClass(this, SlideshowDateTimeValueIterator.class);
			pageContext.getOut().print(theSlideshowDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

