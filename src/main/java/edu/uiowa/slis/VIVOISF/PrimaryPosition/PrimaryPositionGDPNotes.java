package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionGDPNotesIterator thePrimaryPosition = (PrimaryPositionGDPNotesIterator)findAncestorWithClass(this, PrimaryPositionGDPNotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

