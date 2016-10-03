package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingLccnIterator theBlogPosting = (BlogPostingLccnIterator)findAncestorWithClass(this, BlogPostingLccnIterator.class);
			pageContext.getOut().print(theBlogPosting.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for lccn tag ");
		}
		return SKIP_BODY;
	}
}

