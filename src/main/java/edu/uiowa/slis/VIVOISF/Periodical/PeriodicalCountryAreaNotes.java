package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCountryAreaNotesIterator thePeriodical = (PeriodicalCountryAreaNotesIterator)findAncestorWithClass(this, PeriodicalCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePeriodical.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

