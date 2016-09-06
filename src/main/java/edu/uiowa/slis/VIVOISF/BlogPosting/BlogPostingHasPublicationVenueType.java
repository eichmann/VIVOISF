package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingHasPublicationVenueIterator theBlogPostingHasPublicationVenueIterator = (BlogPostingHasPublicationVenueIterator)findAncestorWithClass(this, BlogPostingHasPublicationVenueIterator.class);
			pageContext.getOut().print(theBlogPostingHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

