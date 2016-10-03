package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueIdentifierIterator theIssue = (IssueIdentifierIterator)findAncestorWithClass(this, IssueIdentifierIterator.class);
			pageContext.getOut().print(theIssue.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for identifier tag ");
		}
		return SKIP_BODY;
	}
}

