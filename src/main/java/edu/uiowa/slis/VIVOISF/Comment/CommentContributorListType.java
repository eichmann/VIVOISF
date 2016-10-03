package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentContributorListIterator theCommentContributorListIterator = (CommentContributorListIterator)findAncestorWithClass(this, CommentContributorListIterator.class);
			pageContext.getOut().print(theCommentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

