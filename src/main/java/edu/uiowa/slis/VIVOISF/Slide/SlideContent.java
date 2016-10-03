package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideContent currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideContentIterator theSlide = (SlideContentIterator)findAncestorWithClass(this, SlideContentIterator.class);
			pageContext.getOut().print(theSlide.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for content tag ");
		}
		return SKIP_BODY;
	}
}

