package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingProducerIterator theBlogPostingProducerIterator = (BlogPostingProducerIterator)findAncestorWithClass(this, BlogPostingProducerIterator.class);
			pageContext.getOut().print(theBlogPostingProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for producer tag ");
		}
		return SKIP_BODY;
	}
}
