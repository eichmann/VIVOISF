package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentTranscriptOfIterator theCommentTranscriptOfIterator = (CommentTranscriptOfIterator)findAncestorWithClass(this, CommentTranscriptOfIterator.class);
			pageContext.getOut().print(theCommentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

