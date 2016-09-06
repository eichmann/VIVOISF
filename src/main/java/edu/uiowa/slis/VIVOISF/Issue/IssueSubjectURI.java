package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			if (!theIssue.commitNeeded) {
				pageContext.getOut().print(theIssue.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			return theIssue.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Issue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Issue theIssue = (Issue)findAncestorWithClass(this, Issue.class);
			theIssue.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for subjectURI tag ");
		}
	}
}

