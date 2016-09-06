package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentPresentedAtIterator theCommentPresentedAtIterator = (CommentPresentedAtIterator)findAncestorWithClass(this, CommentPresentedAtIterator.class);
			pageContext.getOut().print(theCommentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

