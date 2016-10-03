package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentIdentifierIterator theComment = (CommentIdentifierIterator)findAncestorWithClass(this, CommentIdentifierIterator.class);
			pageContext.getOut().print(theComment.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for identifier tag ");
		}
		return SKIP_BODY;
	}
}

