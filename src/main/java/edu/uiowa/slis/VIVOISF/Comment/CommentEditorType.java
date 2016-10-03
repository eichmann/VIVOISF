package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentEditorIterator theCommentEditorIterator = (CommentEditorIterator)findAncestorWithClass(this, CommentEditorIterator.class);
			pageContext.getOut().print(theCommentEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for editor tag ");
		}
		return SKIP_BODY;
	}
}

