package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			if (!theBlogPosting.commitNeeded) {
				pageContext.getOut().print(theBlogPosting.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			return theBlogPosting.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing BlogPosting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			BlogPosting theBlogPosting = (BlogPosting)findAncestorWithClass(this, BlogPosting.class);
			theBlogPosting.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for subjectURI tag ");
		}
	}
}

