package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIsbn10Iterator theBlogPosting = (BlogPostingIsbn10Iterator)findAncestorWithClass(this, BlogPostingIsbn10Iterator.class);
			pageContext.getOut().print(theBlogPosting.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

