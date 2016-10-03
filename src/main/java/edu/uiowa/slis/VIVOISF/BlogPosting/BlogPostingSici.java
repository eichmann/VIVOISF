package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingSiciIterator theBlogPosting = (BlogPostingSiciIterator)findAncestorWithClass(this, BlogPostingSiciIterator.class);
			pageContext.getOut().print(theBlogPosting.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for sici tag ");
		}
		return SKIP_BODY;
	}
}

