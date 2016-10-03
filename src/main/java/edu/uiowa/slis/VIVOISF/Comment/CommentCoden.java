package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentCodenIterator theComment = (CommentCodenIterator)findAncestorWithClass(this, CommentCodenIterator.class);
			pageContext.getOut().print(theComment.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for coden tag ");
		}
		return SKIP_BODY;
	}
}

