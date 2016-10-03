package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogCodenIterator theBlog = (BlogCodenIterator)findAncestorWithClass(this, BlogCodenIterator.class);
			pageContext.getOut().print(theBlog.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for coden tag ");
		}
		return SKIP_BODY;
	}
}

