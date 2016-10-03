package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentIssuerIterator theCommentIssuerIterator = (CommentIssuerIterator)findAncestorWithClass(this, CommentIssuerIterator.class);
			pageContext.getOut().print(theCommentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for issuer tag ");
		}
		return SKIP_BODY;
	}
}

