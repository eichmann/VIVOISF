package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingCodenIterator theBlogPosting = (BlogPostingCodenIterator)findAncestorWithClass(this, BlogPostingCodenIterator.class);
			pageContext.getOut().print(theBlogPosting.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for coden tag ");
		}
		return SKIP_BODY;
	}
}

