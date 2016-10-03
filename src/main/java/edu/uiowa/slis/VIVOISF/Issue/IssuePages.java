package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuePages currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssuePagesIterator theIssue = (IssuePagesIterator)findAncestorWithClass(this, IssuePagesIterator.class);
			pageContext.getOut().print(theIssue.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for pages tag ");
		}
		return SKIP_BODY;
	}
}

