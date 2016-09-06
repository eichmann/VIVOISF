package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingNihmsidIterator theBlogPosting = (BlogPostingNihmsidIterator)findAncestorWithClass(this, BlogPostingNihmsidIterator.class);
			pageContext.getOut().print(theBlogPosting.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

