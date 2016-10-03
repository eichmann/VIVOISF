package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingReviewOfIterator theBlogPostingReviewOfIterator = (BlogPostingReviewOfIterator)findAncestorWithClass(this, BlogPostingReviewOfIterator.class);
			pageContext.getOut().print(theBlogPostingReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

