package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLandAreaNotesIterator theJournal = (JournalLandAreaNotesIterator)findAncestorWithClass(this, JournalLandAreaNotesIterator.class);
			pageContext.getOut().print(theJournal.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

