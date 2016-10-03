package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentLocatorIterator theComment = (CommentLocatorIterator)findAncestorWithClass(this, CommentLocatorIterator.class);
			pageContext.getOut().print(theComment.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for locator tag ");
		}
		return SKIP_BODY;
	}
}

