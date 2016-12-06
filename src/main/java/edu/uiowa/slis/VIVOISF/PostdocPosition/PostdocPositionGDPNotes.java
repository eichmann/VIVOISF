package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionGDPNotesIterator thePostdocPosition = (PostdocPositionGDPNotesIterator)findAncestorWithClass(this, PostdocPositionGDPNotesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

