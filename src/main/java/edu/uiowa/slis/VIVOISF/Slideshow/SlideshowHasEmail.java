package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasEmailIterator theSlideshowHasEmailIterator = (SlideshowHasEmailIterator)findAncestorWithClass(this, SlideshowHasEmailIterator.class);
			pageContext.getOut().print(theSlideshowHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

