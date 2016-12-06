package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPopulationNotesIterator thePeriodical = (PeriodicalPopulationNotesIterator)findAncestorWithClass(this, PeriodicalPopulationNotesIterator.class);
			pageContext.getOut().print(thePeriodical.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

