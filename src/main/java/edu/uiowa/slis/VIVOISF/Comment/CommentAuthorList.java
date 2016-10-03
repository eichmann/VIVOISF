package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentAuthorListIterator theCommentAuthorListIterator = (CommentAuthorListIterator)findAncestorWithClass(this, CommentAuthorListIterator.class);
			pageContext.getOut().print(theCommentAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for authorList tag ");
		}
		return SKIP_BODY;
	}
}

