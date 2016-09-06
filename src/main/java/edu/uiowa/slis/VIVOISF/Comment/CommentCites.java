package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentCites currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentCitesIterator theCommentCitesIterator = (CommentCitesIterator)findAncestorWithClass(this, CommentCitesIterator.class);
			pageContext.getOut().print(theCommentCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for cites tag ");
		}
		return SKIP_BODY;
	}
}

