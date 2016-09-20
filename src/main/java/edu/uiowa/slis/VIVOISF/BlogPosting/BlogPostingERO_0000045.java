package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingERO_0000045Iterator theBlogPosting = (BlogPostingERO_0000045Iterator)findAncestorWithClass(this, BlogPostingERO_0000045Iterator.class);
			pageContext.getOut().print(theBlogPosting.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

