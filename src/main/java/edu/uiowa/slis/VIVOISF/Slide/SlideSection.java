package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideSection currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideSectionIterator theSlide = (SlideSectionIterator)findAncestorWithClass(this, SlideSectionIterator.class);
			pageContext.getOut().print(theSlide.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for section tag ");
		}
		return SKIP_BODY;
	}
}

