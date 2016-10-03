package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogOclcnumIterator theBlog = (BlogOclcnumIterator)findAncestorWithClass(this, BlogOclcnumIterator.class);
			pageContext.getOut().print(theBlog.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

