package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingCitesIterator theBlogPostingCitesIterator = (BlogPostingCitesIterator)findAncestorWithClass(this, BlogPostingCitesIterator.class);
			pageContext.getOut().print(theBlogPostingCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for cites tag ");
		}
		return SKIP_BODY;
	}
}

