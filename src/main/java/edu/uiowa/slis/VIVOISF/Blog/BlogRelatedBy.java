package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogRelatedByIterator theBlogRelatedByIterator = (BlogRelatedByIterator)findAncestorWithClass(this, BlogRelatedByIterator.class);
			pageContext.getOut().print(theBlogRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

