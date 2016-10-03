package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogNumVolumesIterator theBlog = (BlogNumVolumesIterator)findAncestorWithClass(this, BlogNumVolumesIterator.class);
			pageContext.getOut().print(theBlog.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

