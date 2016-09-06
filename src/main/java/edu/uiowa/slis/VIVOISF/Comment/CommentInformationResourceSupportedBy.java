package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentInformationResourceSupportedByIterator theCommentInformationResourceSupportedByIterator = (CommentInformationResourceSupportedByIterator)findAncestorWithClass(this, CommentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCommentInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

