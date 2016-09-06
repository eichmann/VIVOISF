package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentReproducedInIterator theCommentReproducedInIterator = (CommentReproducedInIterator)findAncestorWithClass(this, CommentReproducedInIterator.class);
			pageContext.getOut().print(theCommentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

