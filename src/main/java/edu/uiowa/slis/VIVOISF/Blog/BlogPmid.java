package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPmidIterator theBlog = (BlogPmidIterator)findAncestorWithClass(this, BlogPmidIterator.class);
			pageContext.getOut().print(theBlog.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for pmid tag ");
		}
		return SKIP_BODY;
	}
}

