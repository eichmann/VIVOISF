package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListZHIterator theJournal = (JournalNameListZHIterator)findAncestorWithClass(this, JournalNameListZHIterator.class);
			pageContext.getOut().print(theJournal.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

