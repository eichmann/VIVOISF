package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingUriIterator theBlogPosting = (BlogPostingUriIterator)findAncestorWithClass(this, BlogPostingUriIterator.class);
			pageContext.getOut().print(theBlogPosting.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for uri tag ");
		}
		return SKIP_BODY;
	}
}
