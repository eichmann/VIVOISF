package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideShortTitleIterator theSlide = (SlideShortTitleIterator)findAncestorWithClass(this, SlideShortTitleIterator.class);
			pageContext.getOut().print(theSlide.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

