package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentTheAbstractIterator theComment = (CommentTheAbstractIterator)findAncestorWithClass(this, CommentTheAbstractIterator.class);
			pageContext.getOut().print(theComment.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

