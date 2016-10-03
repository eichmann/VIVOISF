package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingDistributorIterator theBlogPostingDistributorIterator = (BlogPostingDistributorIterator)findAncestorWithClass(this, BlogPostingDistributorIterator.class);
			pageContext.getOut().print(theBlogPostingDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for distributor tag ");
		}
		return SKIP_BODY;
	}
}

