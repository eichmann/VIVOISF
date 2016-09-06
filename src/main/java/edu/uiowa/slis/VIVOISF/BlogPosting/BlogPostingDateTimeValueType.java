package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingDateTimeValueIterator theBlogPostingDateTimeValueIterator = (BlogPostingDateTimeValueIterator)findAncestorWithClass(this, BlogPostingDateTimeValueIterator.class);
			pageContext.getOut().print(theBlogPostingDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

