package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingNumberIterator theBlogPosting = (BlogPostingNumberIterator)findAncestorWithClass(this, BlogPostingNumberIterator.class);
			pageContext.getOut().print(theBlogPosting.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for number tag ");
		}
		return SKIP_BODY;
	}
}

