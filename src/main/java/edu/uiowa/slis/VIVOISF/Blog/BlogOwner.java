package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogOwnerIterator theBlogOwnerIterator = (BlogOwnerIterator)findAncestorWithClass(this, BlogOwnerIterator.class);
			pageContext.getOut().print(theBlogOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for owner tag ");
		}
		return SKIP_BODY;
	}
}

