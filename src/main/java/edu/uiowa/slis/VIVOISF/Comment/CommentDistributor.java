package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentDistributorIterator theCommentDistributorIterator = (CommentDistributorIterator)findAncestorWithClass(this, CommentDistributorIterator.class);
			pageContext.getOut().print(theCommentDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for distributor tag ");
		}
		return SKIP_BODY;
	}
}

