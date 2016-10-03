package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentEanucc13Iterator theComment = (CommentEanucc13Iterator)findAncestorWithClass(this, CommentEanucc13Iterator.class);
			pageContext.getOut().print(theComment.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

