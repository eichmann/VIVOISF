package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentTranslationOfIterator theCommentTranslationOfIterator = (CommentTranslationOfIterator)findAncestorWithClass(this, CommentTranslationOfIterator.class);
			pageContext.getOut().print(theCommentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

