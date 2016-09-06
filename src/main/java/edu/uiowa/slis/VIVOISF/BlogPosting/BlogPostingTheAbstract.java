package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingTheAbstractIterator theBlogPosting = (BlogPostingTheAbstractIterator)findAncestorWithClass(this, BlogPostingTheAbstractIterator.class);
			pageContext.getOut().print(theBlogPosting.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

