package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentIAO_0000136Iterator theCommentIAO_0000136Iterator = (CommentIAO_0000136Iterator)findAncestorWithClass(this, CommentIAO_0000136Iterator.class);
			pageContext.getOut().print(theCommentIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

