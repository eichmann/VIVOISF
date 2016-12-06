package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasTitleIterator theSlideshowHasTitleIterator = (SlideshowHasTitleIterator)findAncestorWithClass(this, SlideshowHasTitleIterator.class);
			pageContext.getOut().print(theSlideshowHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

