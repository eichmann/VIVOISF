package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIdentifierIterator theBlogPosting = (BlogPostingIdentifierIterator)findAncestorWithClass(this, BlogPostingIdentifierIterator.class);
			pageContext.getOut().print(theBlogPosting.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for identifier tag ");
		}
		return SKIP_BODY;
	}
}

