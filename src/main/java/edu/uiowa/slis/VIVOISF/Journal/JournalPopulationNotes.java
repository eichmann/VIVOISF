package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalPopulationNotesIterator theJournal = (JournalPopulationNotesIterator)findAncestorWithClass(this, JournalPopulationNotesIterator.class);
			pageContext.getOut().print(theJournal.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

