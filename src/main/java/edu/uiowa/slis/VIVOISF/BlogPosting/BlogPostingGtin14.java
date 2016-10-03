package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingGtin14Iterator theBlogPosting = (BlogPostingGtin14Iterator)findAncestorWithClass(this, BlogPostingGtin14Iterator.class);
			pageContext.getOut().print(theBlogPosting.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

