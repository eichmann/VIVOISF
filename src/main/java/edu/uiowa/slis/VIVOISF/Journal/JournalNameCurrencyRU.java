package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyRUIterator theJournal = (JournalNameCurrencyRUIterator)findAncestorWithClass(this, JournalNameCurrencyRUIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

