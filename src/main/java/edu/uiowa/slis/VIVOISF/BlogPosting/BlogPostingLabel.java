package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			if (!theBlogPosting.commitNeeded) {
				pageContext.getOut().print(theBlogPosting.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			return theBlogPosting.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BlogPosting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			theBlogPosting.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for label tag ");
		}
	}
}

