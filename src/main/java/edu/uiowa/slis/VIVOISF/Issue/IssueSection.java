package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueSection currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueSectionIterator theIssue = (IssueSectionIterator)findAncestorWithClass(this, IssueSectionIterator.class);
			pageContext.getOut().print(theIssue.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for section tag ");
		}
		return SKIP_BODY;
	}
}

