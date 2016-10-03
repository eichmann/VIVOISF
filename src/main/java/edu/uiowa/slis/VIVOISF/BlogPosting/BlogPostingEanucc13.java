package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingEanucc13Iterator theBlogPosting = (BlogPostingEanucc13Iterator)findAncestorWithClass(this, BlogPostingEanucc13Iterator.class);
			pageContext.getOut().print(theBlogPosting.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

