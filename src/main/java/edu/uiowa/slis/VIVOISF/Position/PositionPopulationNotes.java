package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionPopulationNotesIterator thePosition = (PositionPopulationNotesIterator)findAncestorWithClass(this, PositionPopulationNotesIterator.class);
			pageContext.getOut().print(thePosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

