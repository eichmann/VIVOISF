package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingDocumentationForIterator theBlogPostingDocumentationForIterator = (BlogPostingDocumentationForIterator)findAncestorWithClass(this, BlogPostingDocumentationForIterator.class);
			pageContext.getOut().print(theBlogPostingDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

