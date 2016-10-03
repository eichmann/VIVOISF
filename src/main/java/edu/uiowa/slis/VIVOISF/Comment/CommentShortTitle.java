package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentShortTitleIterator theComment = (CommentShortTitleIterator)findAncestorWithClass(this, CommentShortTitleIterator.class);
			pageContext.getOut().print(theComment.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

