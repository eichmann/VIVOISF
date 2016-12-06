package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionAgriculturalAreaNotesIterator thePostdocPosition = (PostdocPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, PostdocPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

