package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			if (!theComment.commitNeeded) {
				pageContext.getOut().print(theComment.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			return theComment.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Comment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			theComment.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for label tag ");
		}
	}
}

