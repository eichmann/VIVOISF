package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingHandleIterator theBlogPosting = (BlogPostingHandleIterator)findAncestorWithClass(this, BlogPostingHandleIterator.class);
			pageContext.getOut().print(theBlogPosting.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for handle tag ");
		}
		return SKIP_BODY;
	}
}

