package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingReproducesIterator theBlogPostingReproducesIterator = (BlogPostingReproducesIterator)findAncestorWithClass(this, BlogPostingReproducesIterator.class);
			pageContext.getOut().print(theBlogPostingReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

