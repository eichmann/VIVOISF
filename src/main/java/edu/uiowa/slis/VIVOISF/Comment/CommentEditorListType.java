package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentEditorListIterator theCommentEditorListIterator = (CommentEditorListIterator)findAncestorWithClass(this, CommentEditorListIterator.class);
			pageContext.getOut().print(theCommentEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for editorList tag ");
		}
		return SKIP_BODY;
	}
}

