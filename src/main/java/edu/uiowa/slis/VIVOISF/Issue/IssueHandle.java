package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueHandleIterator theIssue = (IssueHandleIterator)findAncestorWithClass(this, IssueHandleIterator.class);
			pageContext.getOut().print(theIssue.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for handle tag ");
		}
		return SKIP_BODY;
	}
}

