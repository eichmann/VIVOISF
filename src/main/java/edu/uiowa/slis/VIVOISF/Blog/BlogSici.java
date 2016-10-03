package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogSiciIterator theBlog = (BlogSiciIterator)findAncestorWithClass(this, BlogSiciIterator.class);
			pageContext.getOut().print(theBlog.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for sici tag ");
		}
		return SKIP_BODY;
	}
}

