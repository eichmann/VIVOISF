package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentReviewOfIterator theCommentReviewOfIterator = (CommentReviewOfIterator)findAncestorWithClass(this, CommentReviewOfIterator.class);
			pageContext.getOut().print(theCommentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

