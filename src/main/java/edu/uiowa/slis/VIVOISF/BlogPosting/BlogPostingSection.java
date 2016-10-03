package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingSection currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingSectionIterator theBlogPosting = (BlogPostingSectionIterator)findAncestorWithClass(this, BlogPostingSectionIterator.class);
			pageContext.getOut().print(theBlogPosting.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for section tag ");
		}
		return SKIP_BODY;
	}
}

