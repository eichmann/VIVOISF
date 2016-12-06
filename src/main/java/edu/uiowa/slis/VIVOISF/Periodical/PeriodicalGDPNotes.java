package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGDPNotesIterator thePeriodical = (PeriodicalGDPNotesIterator)findAncestorWithClass(this, PeriodicalGDPNotesIterator.class);
			pageContext.getOut().print(thePeriodical.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

