package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingTranslationOfIterator theBlogPostingTranslationOfIterator = (BlogPostingTranslationOfIterator)findAncestorWithClass(this, BlogPostingTranslationOfIterator.class);
			pageContext.getOut().print(theBlogPostingTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

