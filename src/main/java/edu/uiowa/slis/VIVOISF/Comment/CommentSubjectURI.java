package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			if (!theComment.commitNeeded) {
				pageContext.getOut().print(theComment.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			return theComment.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Comment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Comment theComment = (Comment)findAncestorWithClass(this, Comment.class);
			theComment.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for subjectURI tag ");
		}
	}
}

