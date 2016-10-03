package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueLocatorIterator theIssue = (IssueLocatorIterator)findAncestorWithClass(this, IssueLocatorIterator.class);
			pageContext.getOut().print(theIssue.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for locator tag ");
		}
		return SKIP_BODY;
	}
}

