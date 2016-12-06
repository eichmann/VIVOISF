package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNationalityRUIterator theSlideshow = (SlideshowNationalityRUIterator)findAncestorWithClass(this, SlideshowNationalityRUIterator.class);
			pageContext.getOut().print(theSlideshow.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

