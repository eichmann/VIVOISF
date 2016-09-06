package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogDoiIterator theBlog = (BlogDoiIterator)findAncestorWithClass(this, BlogDoiIterator.class);
			pageContext.getOut().print(theBlog.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for doi tag ");
		}
		return SKIP_BODY;
	}
}

