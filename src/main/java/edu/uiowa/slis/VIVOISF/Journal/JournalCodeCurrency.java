package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodeCurrencyIterator theJournal = (JournalCodeCurrencyIterator)findAncestorWithClass(this, JournalCodeCurrencyIterator.class);
			pageContext.getOut().print(theJournal.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

