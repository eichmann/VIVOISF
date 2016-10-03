package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperReviewOfIterator theConferencePaperReviewOfIterator = (ConferencePaperReviewOfIterator)findAncestorWithClass(this, ConferencePaperReviewOfIterator.class);
			pageContext.getOut().print(theConferencePaperReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

