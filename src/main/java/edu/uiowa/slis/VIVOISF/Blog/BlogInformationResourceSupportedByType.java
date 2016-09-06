package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogInformationResourceSupportedByIterator theBlogInformationResourceSupportedByIterator = (BlogInformationResourceSupportedByIterator)findAncestorWithClass(this, BlogInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBlogInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

