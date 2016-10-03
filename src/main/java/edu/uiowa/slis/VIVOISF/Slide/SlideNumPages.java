package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideNumPagesIterator theSlide = (SlideNumPagesIterator)findAncestorWithClass(this, SlideNumPagesIterator.class);
			pageContext.getOut().print(theSlide.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for numPages tag ");
		}
		return SKIP_BODY;
	}
}

