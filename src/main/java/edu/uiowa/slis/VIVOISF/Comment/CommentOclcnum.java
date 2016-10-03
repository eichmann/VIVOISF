package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentOclcnumIterator theComment = (CommentOclcnumIterator)findAncestorWithClass(this, CommentOclcnumIterator.class);
			pageContext.getOut().print(theComment.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

