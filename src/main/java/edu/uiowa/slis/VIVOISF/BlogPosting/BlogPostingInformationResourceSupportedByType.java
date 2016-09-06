package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingInformationResourceSupportedByIterator theBlogPostingInformationResourceSupportedByIterator = (BlogPostingInformationResourceSupportedByIterator)findAncestorWithClass(this, BlogPostingInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBlogPostingInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

