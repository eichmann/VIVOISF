package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterReviewOfIterator theConferencePosterReviewOfIterator = (ConferencePosterReviewOfIterator)findAncestorWithClass(this, ConferencePosterReviewOfIterator.class);
			pageContext.getOut().print(theConferencePosterReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

