package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentContentIterator theComment = (CommentContentIterator)findAncestorWithClass(this, CommentContentIterator.class);
			pageContext.getOut().print(theComment.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for content tag ");
		}
		return SKIP_BODY;
	}
}

