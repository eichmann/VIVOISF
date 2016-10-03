package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogIsbn10Iterator theBlog = (BlogIsbn10Iterator)findAncestorWithClass(this, BlogIsbn10Iterator.class);
			pageContext.getOut().print(theBlog.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

