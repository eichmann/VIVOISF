package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueNumberIterator theIssue = (IssueNumberIterator)findAncestorWithClass(this, IssueNumberIterator.class);
			pageContext.getOut().print(theIssue.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for number tag ");
		}
		return SKIP_BODY;
	}
}

