package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogInformationResourceSupportedByIterator theBlogInformationResourceSupportedByIterator = (BlogInformationResourceSupportedByIterator)findAncestorWithClass(this, BlogInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBlogInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

