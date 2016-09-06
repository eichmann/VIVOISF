package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueDoiIterator theIssue = (IssueDoiIterator)findAncestorWithClass(this, IssueDoiIterator.class);
			pageContext.getOut().print(theIssue.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for doi tag ");
		}
		return SKIP_BODY;
	}
}

