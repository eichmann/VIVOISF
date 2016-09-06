package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommentVolumeIterator theComment = (CommentVolumeIterator)findAncestorWithClass(this, CommentVolumeIterator.class);
			pageContext.getOut().print(theComment.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for volume tag ");
		}
		return SKIP_BODY;
	}
}

