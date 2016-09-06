package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogRO_0000056Iterator theBlogRO_0000056Iterator = (BlogRO_0000056Iterator)findAncestorWithClass(this, BlogRO_0000056Iterator.class);
			pageContext.getOut().print(theBlogRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

