package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentIsbn10Iterator theComment = (CommentIsbn10Iterator)findAncestorWithClass(this, CommentIsbn10Iterator.class);
			pageContext.getOut().print(theComment.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

