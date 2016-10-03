package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueCodenIterator theIssue = (IssueCodenIterator)findAncestorWithClass(this, IssueCodenIterator.class);
			pageContext.getOut().print(theIssue.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for coden tag ");
		}
		return SKIP_BODY;
	}
}

