package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingShortDescriptionIterator theBlogPosting = (BlogPostingShortDescriptionIterator)findAncestorWithClass(this, BlogPostingShortDescriptionIterator.class);
			pageContext.getOut().print(theBlogPosting.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

