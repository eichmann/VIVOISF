package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogIssnIterator theBlog = (BlogIssnIterator)findAncestorWithClass(this, BlogIssnIterator.class);
			pageContext.getOut().print(theBlog.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for issn tag ");
		}
		return SKIP_BODY;
	}
}

