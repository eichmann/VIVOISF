package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentSiciIterator theComment = (CommentSiciIterator)findAncestorWithClass(this, CommentSiciIterator.class);
			pageContext.getOut().print(theComment.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for sici tag ");
		}
		return SKIP_BODY;
	}
}

