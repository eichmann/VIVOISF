package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueShortTitleIterator theIssue = (IssueShortTitleIterator)findAncestorWithClass(this, IssueShortTitleIterator.class);
			pageContext.getOut().print(theIssue.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

