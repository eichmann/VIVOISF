package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterReviewOfIterator theConferencePosterReviewOfIterator = (ConferencePosterReviewOfIterator)findAncestorWithClass(this, ConferencePosterReviewOfIterator.class);
			pageContext.getOut().print(theConferencePosterReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

