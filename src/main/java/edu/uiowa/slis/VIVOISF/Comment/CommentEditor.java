package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentEditorIterator theCommentEditorIterator = (CommentEditorIterator)findAncestorWithClass(this, CommentEditorIterator.class);
			pageContext.getOut().print(theCommentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for editor tag ");
		}
		return SKIP_BODY;
	}
}

