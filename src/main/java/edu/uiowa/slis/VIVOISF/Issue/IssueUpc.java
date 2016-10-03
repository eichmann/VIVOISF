package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueUpcIterator theIssue = (IssueUpcIterator)findAncestorWithClass(this, IssueUpcIterator.class);
			pageContext.getOut().print(theIssue.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for upc tag ");
		}
		return SKIP_BODY;
	}
}

