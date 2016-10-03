package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideHandleIterator theSlide = (SlideHandleIterator)findAncestorWithClass(this, SlideHandleIterator.class);
			pageContext.getOut().print(theSlide.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for handle tag ");
		}
		return SKIP_BODY;
	}
}

