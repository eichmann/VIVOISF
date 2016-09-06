package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingRO_0000056Iterator theBlogPostingRO_0000056Iterator = (BlogPostingRO_0000056Iterator)findAncestorWithClass(this, BlogPostingRO_0000056Iterator.class);
			pageContext.getOut().print(theBlogPostingRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

