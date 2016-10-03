package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingOwnerIterator theBlogPostingOwnerIterator = (BlogPostingOwnerIterator)findAncestorWithClass(this, BlogPostingOwnerIterator.class);
			pageContext.getOut().print(theBlogPostingOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for owner tag ");
		}
		return SKIP_BODY;
	}
}
