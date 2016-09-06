package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentFeaturesIterator theCommentFeaturesIterator = (CommentFeaturesIterator)findAncestorWithClass(this, CommentFeaturesIterator.class);
			pageContext.getOut().print(theCommentFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for features tag ");
		}
		return SKIP_BODY;
	}
}

