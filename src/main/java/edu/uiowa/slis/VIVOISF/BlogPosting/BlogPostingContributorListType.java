package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingContributorListIterator theBlogPostingContributorListIterator = (BlogPostingContributorListIterator)findAncestorWithClass(this, BlogPostingContributorListIterator.class);
			pageContext.getOut().print(theBlogPostingContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

