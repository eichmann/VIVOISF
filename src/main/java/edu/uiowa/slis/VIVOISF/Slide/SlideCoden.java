package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideCodenIterator theSlide = (SlideCodenIterator)findAncestorWithClass(this, SlideCodenIterator.class);
			pageContext.getOut().print(theSlide.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for coden tag ");
		}
		return SKIP_BODY;
	}
}

