package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogEditorIterator theBlogEditorIterator = (BlogEditorIterator)findAncestorWithClass(this, BlogEditorIterator.class);
			pageContext.getOut().print(theBlogEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for editor tag ");
		}
		return SKIP_BODY;
	}
}

