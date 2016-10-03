package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailReviewOfIterator theEmailReviewOfIterator = (EmailReviewOfIterator)findAncestorWithClass(this, EmailReviewOfIterator.class);
			pageContext.getOut().print(theEmailReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

