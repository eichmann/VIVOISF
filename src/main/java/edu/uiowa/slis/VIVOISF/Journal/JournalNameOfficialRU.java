package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameOfficialRUIterator theJournal = (JournalNameOfficialRUIterator)findAncestorWithClass(this, JournalNameOfficialRUIterator.class);
			pageContext.getOut().print(theJournal.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

