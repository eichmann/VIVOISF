package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingTranslatorIterator theBlogPostingTranslatorIterator = (BlogPostingTranslatorIterator)findAncestorWithClass(this, BlogPostingTranslatorIterator.class);
			pageContext.getOut().print(theBlogPostingTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for translator tag ");
		}
		return SKIP_BODY;
	}
}

