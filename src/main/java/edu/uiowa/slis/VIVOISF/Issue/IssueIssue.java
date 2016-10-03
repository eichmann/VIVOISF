package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueIssueIterator theIssue = (IssueIssueIterator)findAncestorWithClass(this, IssueIssueIterator.class);
			pageContext.getOut().print(theIssue.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for issue tag ");
		}
		return SKIP_BODY;
	}
}

