package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasTitleIterator theSlideshowHasTitleIterator = (SlideshowHasTitleIterator)findAncestorWithClass(this, SlideshowHasTitleIterator.class);
			pageContext.getOut().print(theSlideshowHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

