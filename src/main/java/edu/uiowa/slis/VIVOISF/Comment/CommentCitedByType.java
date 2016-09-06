package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentCitedByIterator theCommentCitedByIterator = (CommentCitedByIterator)findAncestorWithClass(this, CommentCitedByIterator.class);
			pageContext.getOut().print(theCommentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

