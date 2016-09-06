package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentDoiIterator theComment = (CommentDoiIterator)findAncestorWithClass(this, CommentDoiIterator.class);
			pageContext.getOut().print(theComment.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for doi tag ");
		}
		return SKIP_BODY;
	}
}

