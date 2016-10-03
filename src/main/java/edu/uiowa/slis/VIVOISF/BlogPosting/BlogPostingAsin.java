package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingAsinIterator theBlogPosting = (BlogPostingAsinIterator)findAncestorWithClass(this, BlogPostingAsinIterator.class);
			pageContext.getOut().print(theBlogPosting.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for asin tag ");
		}
		return SKIP_BODY;
	}
}

