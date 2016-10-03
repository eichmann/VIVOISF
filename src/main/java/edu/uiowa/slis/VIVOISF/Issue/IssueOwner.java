package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueOwnerIterator theIssueOwnerIterator = (IssueOwnerIterator)findAncestorWithClass(this, IssueOwnerIterator.class);
			pageContext.getOut().print(theIssueOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for owner tag ");
		}
		return SKIP_BODY;
	}
}

