package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingLocatorIterator theBlogPosting = (BlogPostingLocatorIterator)findAncestorWithClass(this, BlogPostingLocatorIterator.class);
			pageContext.getOut().print(theBlogPosting.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for locator tag ");
		}
		return SKIP_BODY;
	}
}

