package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortITIterator theJournal = (JournalNameShortITIterator)findAncestorWithClass(this, JournalNameShortITIterator.class);
			pageContext.getOut().print(theJournal.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

