package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPageStartIterator theBlogPosting = (BlogPostingPageStartIterator)findAncestorWithClass(this, BlogPostingPageStartIterator.class);
			pageContext.getOut().print(theBlogPosting.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

