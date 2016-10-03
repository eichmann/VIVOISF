package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogGtin14Iterator theBlog = (BlogGtin14Iterator)findAncestorWithClass(this, BlogGtin14Iterator.class);
			pageContext.getOut().print(theBlog.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

