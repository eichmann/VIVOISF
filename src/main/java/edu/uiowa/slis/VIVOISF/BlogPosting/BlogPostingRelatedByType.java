package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingRelatedByIterator theBlogPostingRelatedByIterator = (BlogPostingRelatedByIterator)findAncestorWithClass(this, BlogPostingRelatedByIterator.class);
			pageContext.getOut().print(theBlogPostingRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

