package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeFAOSTATIterator theJournal = (JournalCodeFAOSTATIterator)findAncestorWithClass(this, JournalCodeFAOSTATIterator.class);
			pageContext.getOut().print(theJournal.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

