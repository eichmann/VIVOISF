package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListITIterator theJournal = (JournalNameListITIterator)findAncestorWithClass(this, JournalNameListITIterator.class);
			pageContext.getOut().print(theJournal.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

