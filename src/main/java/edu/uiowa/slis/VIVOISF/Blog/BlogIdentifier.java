package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogIdentifierIterator theBlog = (BlogIdentifierIterator)findAncestorWithClass(this, BlogIdentifierIterator.class);
			pageContext.getOut().print(theBlog.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for identifier tag ");
		}
		return SKIP_BODY;
	}
}

