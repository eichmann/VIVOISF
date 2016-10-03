package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingEditionIterator theBlogPosting = (BlogPostingEditionIterator)findAncestorWithClass(this, BlogPostingEditionIterator.class);
			pageContext.getOut().print(theBlogPosting.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for edition tag ");
		}
		return SKIP_BODY;
	}
}

