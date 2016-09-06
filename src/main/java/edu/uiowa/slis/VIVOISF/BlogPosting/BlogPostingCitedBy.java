package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingCitedByIterator theBlogPostingCitedByIterator = (BlogPostingCitedByIterator)findAncestorWithClass(this, BlogPostingCitedByIterator.class);
			pageContext.getOut().print(theBlogPostingCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

