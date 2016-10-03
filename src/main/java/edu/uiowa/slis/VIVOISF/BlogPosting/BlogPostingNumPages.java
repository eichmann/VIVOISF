package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingNumPagesIterator theBlogPosting = (BlogPostingNumPagesIterator)findAncestorWithClass(this, BlogPostingNumPagesIterator.class);
			pageContext.getOut().print(theBlogPosting.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for numPages tag ");
		}
		return SKIP_BODY;
	}
}

