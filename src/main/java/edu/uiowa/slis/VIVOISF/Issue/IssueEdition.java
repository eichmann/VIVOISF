package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueEditionIterator theIssue = (IssueEditionIterator)findAncestorWithClass(this, IssueEditionIterator.class);
			pageContext.getOut().print(theIssue.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for edition tag ");
		}
		return SKIP_BODY;
	}
}

