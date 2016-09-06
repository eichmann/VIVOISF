package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentRO_0000056Iterator theCommentRO_0000056Iterator = (CommentRO_0000056Iterator)findAncestorWithClass(this, CommentRO_0000056Iterator.class);
			pageContext.getOut().print(theCommentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

