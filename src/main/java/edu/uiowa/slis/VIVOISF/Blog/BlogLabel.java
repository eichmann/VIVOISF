package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			if (!theBlog.commitNeeded) {
				pageContext.getOut().print(theBlog.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			return theBlog.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Blog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Blog theBlog = (Blog)findAncestorWithClass(this, Blog.class);
			theBlog.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for label tag ");
		}
	}
}

