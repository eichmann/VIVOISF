package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortRUIterator theJournal = (JournalNameShortRUIterator)findAncestorWithClass(this, JournalNameShortRUIterator.class);
			pageContext.getOut().print(theJournal.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

