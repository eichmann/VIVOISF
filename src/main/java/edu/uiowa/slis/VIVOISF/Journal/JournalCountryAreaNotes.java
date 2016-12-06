package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCountryAreaNotesIterator theJournal = (JournalCountryAreaNotesIterator)findAncestorWithClass(this, JournalCountryAreaNotesIterator.class);
			pageContext.getOut().print(theJournal.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

