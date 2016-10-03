package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingAuthorListIterator theBlogPostingAuthorListIterator = (BlogPostingAuthorListIterator)findAncestorWithClass(this, BlogPostingAuthorListIterator.class);
			pageContext.getOut().print(theBlogPostingAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for authorList tag ");
		}
		return SKIP_BODY;
	}
}
