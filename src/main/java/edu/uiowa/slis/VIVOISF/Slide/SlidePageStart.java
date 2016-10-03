package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlidePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlidePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(SlidePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlidePageStartIterator theSlide = (SlidePageStartIterator)findAncestorWithClass(this, SlidePageStartIterator.class);
			pageContext.getOut().print(theSlide.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

