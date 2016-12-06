package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCountryAreaNotesIterator thePrimaryPosition = (PrimaryPositionCountryAreaNotesIterator)findAncestorWithClass(this, PrimaryPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

