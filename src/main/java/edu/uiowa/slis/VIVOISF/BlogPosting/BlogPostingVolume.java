package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BlogPostingVolumeIterator theBlogPosting = (BlogPostingVolumeIterator)findAncestorWithClass(this, BlogPostingVolumeIterator.class);
			pageContext.getOut().print(theBlogPosting.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for volume tag ");
		}
		return SKIP_BODY;
	}
}

