package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			if (!theBlog.commitNeeded) {
				pageContext.getOut().print(theBlog.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			return theBlog.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Blog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			theBlog.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for subjectURI tag ");
		}
	}
}

