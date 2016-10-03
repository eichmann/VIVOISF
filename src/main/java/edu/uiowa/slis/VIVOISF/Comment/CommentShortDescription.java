package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentShortDescriptionIterator theComment = (CommentShortDescriptionIterator)findAncestorWithClass(this, CommentShortDescriptionIterator.class);
			pageContext.getOut().print(theComment.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

