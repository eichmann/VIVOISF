package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogUpcIterator theBlog = (BlogUpcIterator)findAncestorWithClass(this, BlogUpcIterator.class);
			pageContext.getOut().print(theBlog.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for upc tag ");
		}
		return SKIP_BODY;
	}
}

