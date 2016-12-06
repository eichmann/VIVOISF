package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionLandAreaNotesIterator thePosition = (PositionLandAreaNotesIterator)findAncestorWithClass(this, PositionLandAreaNotesIterator.class);
			pageContext.getOut().print(thePosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

