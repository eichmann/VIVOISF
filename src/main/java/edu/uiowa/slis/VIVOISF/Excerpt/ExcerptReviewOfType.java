package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptReviewOfIterator theExcerptReviewOfIterator = (ExcerptReviewOfIterator)findAncestorWithClass(this, ExcerptReviewOfIterator.class);
			pageContext.getOut().print(theExcerptReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

