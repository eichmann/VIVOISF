package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionGDPNotesIterator thePosition = (PositionGDPNotesIterator)findAncestorWithClass(this, PositionGDPNotesIterator.class);
			pageContext.getOut().print(thePosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

