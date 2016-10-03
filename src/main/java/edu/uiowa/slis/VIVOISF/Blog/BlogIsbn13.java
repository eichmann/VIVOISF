package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogIsbn13Iterator theBlog = (BlogIsbn13Iterator)findAncestorWithClass(this, BlogIsbn13Iterator.class);
			pageContext.getOut().print(theBlog.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

