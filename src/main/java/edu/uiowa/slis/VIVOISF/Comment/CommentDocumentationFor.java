package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentDocumentationForIterator theCommentDocumentationForIterator = (CommentDocumentationForIterator)findAncestorWithClass(this, CommentDocumentationForIterator.class);
			pageContext.getOut().print(theCommentDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

