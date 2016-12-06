package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyFRIterator theJournal = (JournalNameCurrencyFRIterator)findAncestorWithClass(this, JournalNameCurrencyFRIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

