package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPmidIterator theBlogPosting = (BlogPostingPmidIterator)findAncestorWithClass(this, BlogPostingPmidIterator.class);
			pageContext.getOut().print(theBlogPosting.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for pmid tag ");
		}
		return SKIP_BODY;
	}
}

