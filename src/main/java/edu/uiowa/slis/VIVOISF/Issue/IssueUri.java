package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueUri currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueUriIterator theIssue = (IssueUriIterator)findAncestorWithClass(this, IssueUriIterator.class);
			pageContext.getOut().print(theIssue.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for uri tag ");
		}
		return SKIP_BODY;
	}
}

