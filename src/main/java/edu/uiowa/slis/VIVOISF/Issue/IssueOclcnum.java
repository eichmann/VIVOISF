package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueOclcnumIterator theIssue = (IssueOclcnumIterator)findAncestorWithClass(this, IssueOclcnumIterator.class);
			pageContext.getOut().print(theIssue.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

