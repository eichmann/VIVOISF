package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentERO_0000045Iterator theComment = (CommentERO_0000045Iterator)findAncestorWithClass(this, CommentERO_0000045Iterator.class);
			pageContext.getOut().print(theComment.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

