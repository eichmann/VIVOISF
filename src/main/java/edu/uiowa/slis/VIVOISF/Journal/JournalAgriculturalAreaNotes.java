package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalAgriculturalAreaNotesIterator theJournal = (JournalAgriculturalAreaNotesIterator)findAncestorWithClass(this, JournalAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theJournal.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

