package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideStatusIterator theSlideStatusIterator = (SlideStatusIterator)findAncestorWithClass(this, SlideStatusIterator.class);
			pageContext.getOut().print(theSlideStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for status tag ");
		}
		return SKIP_BODY;
	}
}

