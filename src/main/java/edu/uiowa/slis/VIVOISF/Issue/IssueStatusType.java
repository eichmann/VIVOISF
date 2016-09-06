package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueStatusIterator theIssueStatusIterator = (IssueStatusIterator)findAncestorWithClass(this, IssueStatusIterator.class);
			pageContext.getOut().print(theIssueStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for status tag ");
		}
		return SKIP_BODY;
	}
}

