package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueContent currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueContentIterator theIssue = (IssueContentIterator)findAncestorWithClass(this, IssueContentIterator.class);
			pageContext.getOut().print(theIssue.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for content tag ");
		}
		return SKIP_BODY;
	}
}

