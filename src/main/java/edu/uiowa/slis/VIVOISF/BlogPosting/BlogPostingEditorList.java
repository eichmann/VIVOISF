package edu.uiowa.slis.VIVOISF.BlogPosting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogPostingEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogPostingEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogPostingEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogPostingEditorListIterator theBlogPostingEditorListIterator = (BlogPostingEditorListIterator)findAncestorWithClass(this, BlogPostingEditorListIterator.class);
			pageContext.getOut().print(theBlogPostingEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing BlogPosting for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BlogPosting for editorList tag ");
		}
		return SKIP_BODY;
	}
}

