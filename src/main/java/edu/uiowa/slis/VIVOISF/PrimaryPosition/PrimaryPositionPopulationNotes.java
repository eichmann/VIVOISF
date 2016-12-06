package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPopulationNotesIterator thePrimaryPosition = (PrimaryPositionPopulationNotesIterator)findAncestorWithClass(this, PrimaryPositionPopulationNotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

