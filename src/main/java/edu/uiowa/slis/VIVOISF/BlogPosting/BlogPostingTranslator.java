package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingTranslatorIterator theBlogPostingTranslatorIterator = (BlogPostingTranslatorIterator)findAncestorWithClass(this, BlogPostingTranslatorIterator.class);
			pageContext.getOut().print(theBlogPostingTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for translator tag ");
		}
		return SKIP_BODY;
	}
}

