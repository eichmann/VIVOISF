package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentPmidIterator theComment = (CommentPmidIterator)findAncestorWithClass(this, CommentPmidIterator.class);
			pageContext.getOut().print(theComment.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for pmid tag ");
		}
		return SKIP_BODY;
	}
}

