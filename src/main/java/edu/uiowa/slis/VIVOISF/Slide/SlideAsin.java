package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideAsinIterator theSlide = (SlideAsinIterator)findAncestorWithClass(this, SlideAsinIterator.class);
			pageContext.getOut().print(theSlide.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for asin tag ");
		}
		return SKIP_BODY;
	}
}

