package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionAgriculturalAreaNotesIterator thePrimaryPosition = (PrimaryPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, PrimaryPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

