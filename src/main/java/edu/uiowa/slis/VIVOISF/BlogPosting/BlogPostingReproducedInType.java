package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingReproducedInIterator theBlogPostingReproducedInIterator = (BlogPostingReproducedInIterator)findAncestorWithClass(this, BlogPostingReproducedInIterator.class);
			pageContext.getOut().print(theBlogPostingReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

