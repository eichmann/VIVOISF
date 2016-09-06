package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			if (!theIssue.commitNeeded) {
				pageContext.getOut().print(theIssue.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			return theIssue.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Issue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			theIssue.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for label tag ");
		}
	}
}

