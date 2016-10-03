package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogUriIterator theBlog = (BlogUriIterator)findAncestorWithClass(this, BlogUriIterator.class);
			pageContext.getOut().print(theBlog.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for uri tag ");
		}
		return SKIP_BODY;
	}
}

