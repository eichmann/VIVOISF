package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentReproducesIterator theCommentReproducesIterator = (CommentReproducesIterator)findAncestorWithClass(this, CommentReproducesIterator.class);
			pageContext.getOut().print(theCommentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

