package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueDocumentationForIterator theIssueDocumentationForIterator = (IssueDocumentationForIterator)findAncestorWithClass(this, IssueDocumentationForIterator.class);
			pageContext.getOut().print(theIssueDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

