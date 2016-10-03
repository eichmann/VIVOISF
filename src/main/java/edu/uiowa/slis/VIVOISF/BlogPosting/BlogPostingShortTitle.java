package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingShortTitleIterator theBlogPosting = (BlogPostingShortTitleIterator)findAncestorWithClass(this, BlogPostingShortTitleIterator.class);
			pageContext.getOut().print(theBlogPosting.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

