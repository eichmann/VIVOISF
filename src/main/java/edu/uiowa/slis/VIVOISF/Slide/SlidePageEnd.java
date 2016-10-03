package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlidePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlidePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(SlidePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlidePageEndIterator theSlide = (SlidePageEndIterator)findAncestorWithClass(this, SlidePageEndIterator.class);
			pageContext.getOut().print(theSlide.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

