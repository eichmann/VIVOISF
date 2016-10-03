package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueShortDescriptionIterator theIssue = (IssueShortDescriptionIterator)findAncestorWithClass(this, IssueShortDescriptionIterator.class);
			pageContext.getOut().print(theIssue.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

