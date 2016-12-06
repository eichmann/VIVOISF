package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPopulationNotesIterator theConferencePaper = (ConferencePaperPopulationNotesIterator)findAncestorWithClass(this, ConferencePaperPopulationNotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

