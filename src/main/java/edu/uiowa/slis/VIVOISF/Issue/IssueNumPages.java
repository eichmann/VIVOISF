package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueNumPagesIterator theIssue = (IssueNumPagesIterator)findAncestorWithClass(this, IssueNumPagesIterator.class);
			pageContext.getOut().print(theIssue.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for numPages tag ");
		}
		return SKIP_BODY;
	}
}

