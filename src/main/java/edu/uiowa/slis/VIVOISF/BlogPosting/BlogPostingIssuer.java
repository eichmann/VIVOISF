package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingIssuerIterator theBlogPostingIssuerIterator = (BlogPostingIssuerIterator)findAncestorWithClass(this, BlogPostingIssuerIterator.class);
			pageContext.getOut().print(theBlogPostingIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for issuer tag ");
		}
		return SKIP_BODY;
	}
}

