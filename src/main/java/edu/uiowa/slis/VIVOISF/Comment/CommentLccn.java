package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentLccnIterator theComment = (CommentLccnIterator)findAncestorWithClass(this, CommentLccnIterator.class);
			pageContext.getOut().print(theComment.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for lccn tag ");
		}
		return SKIP_BODY;
	}
}

