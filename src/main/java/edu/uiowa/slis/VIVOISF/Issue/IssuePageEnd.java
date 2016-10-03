package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssuePageEndIterator theIssue = (IssuePageEndIterator)findAncestorWithClass(this, IssuePageEndIterator.class);
			pageContext.getOut().print(theIssue.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

