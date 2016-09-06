package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIssueIterator theBlogPosting = (BlogPostingIssueIterator)findAncestorWithClass(this, BlogPostingIssueIterator.class);
			pageContext.getOut().print(theBlogPosting.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for issue tag ");
		}
		return SKIP_BODY;
	}
}

