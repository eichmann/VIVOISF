package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingUpcIterator theBlogPosting = (BlogPostingUpcIterator)findAncestorWithClass(this, BlogPostingUpcIterator.class);
			pageContext.getOut().print(theBlogPosting.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for upc tag ");
		}
		return SKIP_BODY;
	}
}

