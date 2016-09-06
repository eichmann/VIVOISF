package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingRelatesIterator theBlogPostingRelatesIterator = (BlogPostingRelatesIterator)findAncestorWithClass(this, BlogPostingRelatesIterator.class);
			pageContext.getOut().print(theBlogPostingRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for relates tag ");
		}
		return SKIP_BODY;
	}
}

