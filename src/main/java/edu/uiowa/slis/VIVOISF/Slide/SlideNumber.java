package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideNumberIterator theSlide = (SlideNumberIterator)findAncestorWithClass(this, SlideNumberIterator.class);
			pageContext.getOut().print(theSlide.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for number tag ");
		}
		return SKIP_BODY;
	}
}

