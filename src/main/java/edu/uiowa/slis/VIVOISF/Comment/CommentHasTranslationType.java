package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentHasTranslationIterator theCommentHasTranslationIterator = (CommentHasTranslationIterator)findAncestorWithClass(this, CommentHasTranslationIterator.class);
			pageContext.getOut().print(theCommentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

