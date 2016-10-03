package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogLccnIterator theBlog = (BlogLccnIterator)findAncestorWithClass(this, BlogLccnIterator.class);
			pageContext.getOut().print(theBlog.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for lccn tag ");
		}
		return SKIP_BODY;
	}
}

