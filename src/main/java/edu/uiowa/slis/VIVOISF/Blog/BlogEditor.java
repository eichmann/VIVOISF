package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogEditorIterator theBlogEditorIterator = (BlogEditorIterator)findAncestorWithClass(this, BlogEditorIterator.class);
			pageContext.getOut().print(theBlogEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for editor tag ");
		}
		return SKIP_BODY;
	}
}

