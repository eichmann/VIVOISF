package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentHandleIterator theComment = (CommentHandleIterator)findAncestorWithClass(this, CommentHandleIterator.class);
			pageContext.getOut().print(theComment.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for handle tag ");
		}
		return SKIP_BODY;
	}
}

