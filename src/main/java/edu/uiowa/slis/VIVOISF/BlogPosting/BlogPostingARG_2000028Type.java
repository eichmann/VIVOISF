package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingARG_2000028Iterator theBlogPostingARG_2000028Iterator = (BlogPostingARG_2000028Iterator)findAncestorWithClass(this, BlogPostingARG_2000028Iterator.class);
			pageContext.getOut().print(theBlogPostingARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

