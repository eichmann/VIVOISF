package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingARG_0000001Iterator theBlogPosting = (BlogPostingARG_0000001Iterator)findAncestorWithClass(this, BlogPostingARG_0000001Iterator.class);
			pageContext.getOut().print(theBlogPosting.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

