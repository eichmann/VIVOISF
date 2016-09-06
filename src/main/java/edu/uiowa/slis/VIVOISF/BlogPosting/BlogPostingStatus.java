package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingStatusIterator theBlogPostingStatusIterator = (BlogPostingStatusIterator)findAncestorWithClass(this, BlogPostingStatusIterator.class);
			pageContext.getOut().print(theBlogPostingStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for status tag ");
		}
		return SKIP_BODY;
	}
}

