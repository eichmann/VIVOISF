package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentCitesIterator theCommentCitesIterator = (CommentCitesIterator)findAncestorWithClass(this, CommentCitesIterator.class);
			pageContext.getOut().print(theCommentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for cites tag ");
		}
		return SKIP_BODY;
	}
}

