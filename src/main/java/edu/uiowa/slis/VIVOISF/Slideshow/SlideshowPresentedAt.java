package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowPresentedAtIterator theSlideshowPresentedAtIterator = (SlideshowPresentedAtIterator)findAncestorWithClass(this, SlideshowPresentedAtIterator.class);
			pageContext.getOut().print(theSlideshowPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

