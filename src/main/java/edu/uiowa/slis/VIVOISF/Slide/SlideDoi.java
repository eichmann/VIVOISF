package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideDoiIterator theSlide = (SlideDoiIterator)findAncestorWithClass(this, SlideDoiIterator.class);
			pageContext.getOut().print(theSlide.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for doi tag ");
		}
		return SKIP_BODY;
	}
}

