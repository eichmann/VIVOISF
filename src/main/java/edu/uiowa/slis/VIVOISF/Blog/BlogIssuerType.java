package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogIssuerIterator theBlogIssuerIterator = (BlogIssuerIterator)findAncestorWithClass(this, BlogIssuerIterator.class);
			pageContext.getOut().print(theBlogIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for issuer tag ");
		}
		return SKIP_BODY;
	}
}

