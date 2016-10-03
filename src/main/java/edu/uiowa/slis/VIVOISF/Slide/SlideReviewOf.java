package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideReviewOfIterator theSlideReviewOfIterator = (SlideReviewOfIterator)findAncestorWithClass(this, SlideReviewOfIterator.class);
			pageContext.getOut().print(theSlideReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

