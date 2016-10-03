package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IssueIsbn13Iterator theIssue = (IssueIsbn13Iterator)findAncestorWithClass(this, IssueIsbn13Iterator.class);
			pageContext.getOut().print(theIssue.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

