package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogHandleIterator theBlog = (BlogHandleIterator)findAncestorWithClass(this, BlogHandleIterator.class);
			pageContext.getOut().print(theBlog.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for handle tag ");
		}
		return SKIP_BODY;
	}
}

