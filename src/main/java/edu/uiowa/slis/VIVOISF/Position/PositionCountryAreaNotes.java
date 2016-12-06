package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCountryAreaNotesIterator thePosition = (PositionCountryAreaNotesIterator)findAncestorWithClass(this, PositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

