package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingTranscriptOfIterator theBlogPostingTranscriptOfIterator = (BlogPostingTranscriptOfIterator)findAncestorWithClass(this, BlogPostingTranscriptOfIterator.class);
			pageContext.getOut().print(theBlogPostingTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

