package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogAsinIterator theBlog = (BlogAsinIterator)findAncestorWithClass(this, BlogAsinIterator.class);
			pageContext.getOut().print(theBlog.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for asin tag ");
		}
		return SKIP_BODY;
	}
}

