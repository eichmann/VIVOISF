package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentAsinIterator theComment = (CommentAsinIterator)findAncestorWithClass(this, CommentAsinIterator.class);
			pageContext.getOut().print(theComment.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for asin tag ");
		}
		return SKIP_BODY;
	}
}

