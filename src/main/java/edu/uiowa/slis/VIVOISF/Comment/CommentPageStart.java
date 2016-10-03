package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentPageStartIterator theComment = (CommentPageStartIterator)findAncestorWithClass(this, CommentPageStartIterator.class);
			pageContext.getOut().print(theComment.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

