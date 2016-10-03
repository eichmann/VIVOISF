package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideShortDescriptionIterator theSlide = (SlideShortDescriptionIterator)findAncestorWithClass(this, SlideShortDescriptionIterator.class);
			pageContext.getOut().print(theSlide.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

