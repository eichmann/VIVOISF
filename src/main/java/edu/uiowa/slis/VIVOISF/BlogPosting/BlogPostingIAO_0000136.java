package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIAO_0000136Iterator theBlogPostingIAO_0000136Iterator = (BlogPostingIAO_0000136Iterator)findAncestorWithClass(this, BlogPostingIAO_0000136Iterator.class);
			pageContext.getOut().print(theBlogPostingIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

