package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortFRIterator theJournal = (JournalNameShortFRIterator)findAncestorWithClass(this, JournalNameShortFRIterator.class);
			pageContext.getOut().print(theJournal.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

