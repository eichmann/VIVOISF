package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentReproducedInIterator theCommentReproducedInIterator = (CommentReproducedInIterator)findAncestorWithClass(this, CommentReproducedInIterator.class);
			pageContext.getOut().print(theCommentReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

