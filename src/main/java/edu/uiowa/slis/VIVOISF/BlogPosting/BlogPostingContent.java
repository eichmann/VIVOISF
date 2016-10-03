package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingContent currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingContentIterator theBlogPosting = (BlogPostingContentIterator)findAncestorWithClass(this, BlogPostingContentIterator.class);
			pageContext.getOut().print(theBlogPosting.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for content tag ");
		}
		return SKIP_BODY;
	}
}

