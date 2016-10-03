package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPageEndIterator theBlogPosting = (BlogPostingPageEndIterator)findAncestorWithClass(this, BlogPostingPageEndIterator.class);
			pageContext.getOut().print(theBlogPosting.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

