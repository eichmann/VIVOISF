package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingPmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingPmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingPmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingPmcidIterator theBlogPosting = (BlogPostingPmcidIterator)findAncestorWithClass(this, BlogPostingPmcidIterator.class);
			pageContext.getOut().print(theBlogPosting.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

