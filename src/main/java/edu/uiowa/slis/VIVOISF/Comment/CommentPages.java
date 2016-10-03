package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentPagesIterator theComment = (CommentPagesIterator)findAncestorWithClass(this, CommentPagesIterator.class);
			pageContext.getOut().print(theComment.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for pages tag ");
		}
		return SKIP_BODY;
	}
}

