package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIsbn13Iterator theBlogPosting = (BlogPostingIsbn13Iterator)findAncestorWithClass(this, BlogPostingIsbn13Iterator.class);
			pageContext.getOut().print(theBlogPosting.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

