package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentSection currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentSectionIterator theComment = (CommentSectionIterator)findAncestorWithClass(this, CommentSectionIterator.class);
			pageContext.getOut().print(theComment.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for section tag ");
		}
		return SKIP_BODY;
	}
}

