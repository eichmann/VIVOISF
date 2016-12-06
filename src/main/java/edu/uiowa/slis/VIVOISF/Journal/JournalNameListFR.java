package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListFRIterator theJournal = (JournalNameListFRIterator)findAncestorWithClass(this, JournalNameListFRIterator.class);
			pageContext.getOut().print(theJournal.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

