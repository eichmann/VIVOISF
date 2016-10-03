package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueReviewOfIterator theIssueReviewOfIterator = (IssueReviewOfIterator)findAncestorWithClass(this, IssueReviewOfIterator.class);
			pageContext.getOut().print(theIssueReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}
