package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogARG_2000028Iterator theBlogARG_2000028Iterator = (BlogARG_2000028Iterator)findAncestorWithClass(this, BlogARG_2000028Iterator.class);
			pageContext.getOut().print(theBlogARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

