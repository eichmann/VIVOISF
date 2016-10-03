package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentUpcIterator theComment = (CommentUpcIterator)findAncestorWithClass(this, CommentUpcIterator.class);
			pageContext.getOut().print(theComment.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for upc tag ");
		}
		return SKIP_BODY;
	}
}

