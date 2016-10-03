package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueIsbn10Iterator theIssue = (IssueIsbn10Iterator)findAncestorWithClass(this, IssueIsbn10Iterator.class);
			pageContext.getOut().print(theIssue.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

