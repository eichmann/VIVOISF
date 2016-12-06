package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionAgriculturalAreaNotesIterator thePosition = (PositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, PositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

