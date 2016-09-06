package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPresentedAtIterator theBlogPostingPresentedAtIterator = (BlogPostingPresentedAtIterator)findAncestorWithClass(this, BlogPostingPresentedAtIterator.class);
			pageContext.getOut().print(theBlogPostingPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

