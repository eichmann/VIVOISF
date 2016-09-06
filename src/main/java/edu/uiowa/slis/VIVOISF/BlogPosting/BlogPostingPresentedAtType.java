package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPresentedAtIterator theBlogPostingPresentedAtIterator = (BlogPostingPresentedAtIterator)findAncestorWithClass(this, BlogPostingPresentedAtIterator.class);
			pageContext.getOut().print(theBlogPostingPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

