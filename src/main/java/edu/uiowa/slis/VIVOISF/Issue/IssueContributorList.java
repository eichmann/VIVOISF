package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueContributorListIterator theIssueContributorListIterator = (IssueContributorListIterator)findAncestorWithClass(this, IssueContributorListIterator.class);
			pageContext.getOut().print(theIssueContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

