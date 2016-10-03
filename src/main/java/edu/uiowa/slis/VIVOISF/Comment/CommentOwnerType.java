package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentOwnerIterator theCommentOwnerIterator = (CommentOwnerIterator)findAncestorWithClass(this, CommentOwnerIterator.class);
			pageContext.getOut().print(theCommentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for owner tag ");
		}
		return SKIP_BODY;
	}
}

