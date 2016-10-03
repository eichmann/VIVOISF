package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPagesIterator theBlogPosting = (BlogPostingPagesIterator)findAncestorWithClass(this, BlogPostingPagesIterator.class);
			pageContext.getOut().print(theBlogPosting.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for pages tag ");
		}
		return SKIP_BODY;
	}
}

