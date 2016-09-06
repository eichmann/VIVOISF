package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingHasTranslationIterator theBlogPostingHasTranslationIterator = (BlogPostingHasTranslationIterator)findAncestorWithClass(this, BlogPostingHasTranslationIterator.class);
			pageContext.getOut().print(theBlogPostingHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

