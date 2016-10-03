package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentIssuerIterator theCommentIssuerIterator = (CommentIssuerIterator)findAncestorWithClass(this, CommentIssuerIterator.class);
			pageContext.getOut().print(theCommentIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for issuer tag ");
		}
		return SKIP_BODY;
	}
}

