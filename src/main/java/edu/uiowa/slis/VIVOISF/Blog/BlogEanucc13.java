package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogEanucc13Iterator theBlog = (BlogEanucc13Iterator)findAncestorWithClass(this, BlogEanucc13Iterator.class);
			pageContext.getOut().print(theBlog.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

