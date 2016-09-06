package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentFeaturesIterator theCommentFeaturesIterator = (CommentFeaturesIterator)findAncestorWithClass(this, CommentFeaturesIterator.class);
			pageContext.getOut().print(theCommentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for features tag ");
		}
		return SKIP_BODY;
	}
}

