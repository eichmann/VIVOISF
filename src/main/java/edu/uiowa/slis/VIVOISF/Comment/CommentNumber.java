package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentNumberIterator theComment = (CommentNumberIterator)findAncestorWithClass(this, CommentNumberIterator.class);
			pageContext.getOut().print(theComment.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for number tag ");
		}
		return SKIP_BODY;
	}
}
