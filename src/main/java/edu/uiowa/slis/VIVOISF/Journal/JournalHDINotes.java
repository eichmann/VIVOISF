package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHDINotesIterator theJournal = (JournalHDINotesIterator)findAncestorWithClass(this, JournalHDINotesIterator.class);
			pageContext.getOut().print(theJournal.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

