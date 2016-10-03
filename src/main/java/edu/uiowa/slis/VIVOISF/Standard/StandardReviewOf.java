package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardReviewOfIterator theStandardReviewOfIterator = (StandardReviewOfIterator)findAncestorWithClass(this, StandardReviewOfIterator.class);
			pageContext.getOut().print(theStandardReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

