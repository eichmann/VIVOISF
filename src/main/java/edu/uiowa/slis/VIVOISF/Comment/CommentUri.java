package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentUriIterator theComment = (CommentUriIterator)findAncestorWithClass(this, CommentUriIterator.class);
			pageContext.getOut().print(theComment.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for uri tag ");
		}
		return SKIP_BODY;
	}
}

