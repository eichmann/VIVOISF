package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentNumPagesIterator theComment = (CommentNumPagesIterator)findAncestorWithClass(this, CommentNumPagesIterator.class);
			pageContext.getOut().print(theComment.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for numPages tag ");
		}
		return SKIP_BODY;
	}
}

