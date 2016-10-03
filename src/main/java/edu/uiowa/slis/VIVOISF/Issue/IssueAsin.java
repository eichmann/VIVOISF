package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueAsinIterator theIssue = (IssueAsinIterator)findAncestorWithClass(this, IssueAsinIterator.class);
			pageContext.getOut().print(theIssue.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for asin tag ");
		}
		return SKIP_BODY;
	}
}

