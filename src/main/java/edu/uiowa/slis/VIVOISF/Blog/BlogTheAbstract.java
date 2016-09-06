package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogTheAbstractIterator theBlog = (BlogTheAbstractIterator)findAncestorWithClass(this, BlogTheAbstractIterator.class);
			pageContext.getOut().print(theBlog.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

