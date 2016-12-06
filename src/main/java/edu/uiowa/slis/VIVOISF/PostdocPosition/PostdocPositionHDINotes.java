package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHDINotesIterator thePostdocPosition = (PostdocPositionHDINotesIterator)findAncestorWithClass(this, PostdocPositionHDINotesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

