package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogIAO_0000136Iterator theBlogIAO_0000136Iterator = (BlogIAO_0000136Iterator)findAncestorWithClass(this, BlogIAO_0000136Iterator.class);
			pageContext.getOut().print(theBlogIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

