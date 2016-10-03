package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterReviewOfIterator theLetterReviewOfIterator = (LetterReviewOfIterator)findAncestorWithClass(this, LetterReviewOfIterator.class);
			pageContext.getOut().print(theLetterReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

