package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingFeaturesIterator theBlogPostingFeaturesIterator = (BlogPostingFeaturesIterator)findAncestorWithClass(this, BlogPostingFeaturesIterator.class);
			pageContext.getOut().print(theBlogPostingFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for features tag ");
		}
		return SKIP_BODY;
	}
}

