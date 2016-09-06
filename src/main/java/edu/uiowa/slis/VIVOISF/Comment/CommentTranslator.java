package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentTranslatorIterator theCommentTranslatorIterator = (CommentTranslatorIterator)findAncestorWithClass(this, CommentTranslatorIterator.class);
			pageContext.getOut().print(theCommentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for translator tag ");
		}
		return SKIP_BODY;
	}
}

