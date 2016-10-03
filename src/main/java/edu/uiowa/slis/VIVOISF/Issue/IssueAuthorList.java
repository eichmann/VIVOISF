package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueAuthorListIterator theIssueAuthorListIterator = (IssueAuthorListIterator)findAncestorWithClass(this, IssueAuthorListIterator.class);
			pageContext.getOut().print(theIssueAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for authorList tag ");
		}
		return SKIP_BODY;
	}
}

