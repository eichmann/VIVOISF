package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingDoiIterator theBlogPosting = (BlogPostingDoiIterator)findAncestorWithClass(this, BlogPostingDoiIterator.class);
			pageContext.getOut().print(theBlogPosting.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for doi tag ");
		}
		return SKIP_BODY;
	}
}

