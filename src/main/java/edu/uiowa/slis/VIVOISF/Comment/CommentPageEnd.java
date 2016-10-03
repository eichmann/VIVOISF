package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentPageEndIterator theComment = (CommentPageEndIterator)findAncestorWithClass(this, CommentPageEndIterator.class);
			pageContext.getOut().print(theComment.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

