package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueAuthorListIterator theIssueAuthorListIterator = (IssueAuthorListIterator)findAncestorWithClass(this, IssueAuthorListIterator.class);
			pageContext.getOut().print(theIssueAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for authorList tag ");
		}
		return SKIP_BODY;
	}
}

