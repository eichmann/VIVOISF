package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGDPNotesIterator theJournal = (JournalGDPNotesIterator)findAncestorWithClass(this, JournalGDPNotesIterator.class);
			pageContext.getOut().print(theJournal.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

