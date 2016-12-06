package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasSubjectAreaIterator thePostdocPositionHasSubjectAreaIterator = (PostdocPositionHasSubjectAreaIterator)findAncestorWithClass(this, PostdocPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePostdocPositionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

