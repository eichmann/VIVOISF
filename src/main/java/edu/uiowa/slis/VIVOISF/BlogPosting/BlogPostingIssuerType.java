package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIssuerIterator theBlogPostingIssuerIterator = (BlogPostingIssuerIterator)findAncestorWithClass(this, BlogPostingIssuerIterator.class);
			pageContext.getOut().print(theBlogPostingIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for issuer tag ");
		}
		return SKIP_BODY;
	}
}

