package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogEissnIterator theBlog = (BlogEissnIterator)findAncestorWithClass(this, BlogEissnIterator.class);
			pageContext.getOut().print(theBlog.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for eissn tag ");
		}
		return SKIP_BODY;
	}
}

