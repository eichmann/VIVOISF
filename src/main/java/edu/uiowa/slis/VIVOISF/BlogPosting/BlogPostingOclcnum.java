package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingOclcnumIterator theBlogPosting = (BlogPostingOclcnumIterator)findAncestorWithClass(this, BlogPostingOclcnumIterator.class);
			pageContext.getOut().print(theBlogPosting.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

