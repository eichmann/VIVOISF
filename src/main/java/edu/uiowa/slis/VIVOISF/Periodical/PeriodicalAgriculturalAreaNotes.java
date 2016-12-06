package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAgriculturalAreaNotesIterator thePeriodical = (PeriodicalAgriculturalAreaNotesIterator)findAncestorWithClass(this, PeriodicalAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thePeriodical.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

