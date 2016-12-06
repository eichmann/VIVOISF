package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeFAOTERMIterator theJournal = (JournalCodeFAOTERMIterator)findAncestorWithClass(this, JournalCodeFAOTERMIterator.class);
			pageContext.getOut().print(theJournal.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

