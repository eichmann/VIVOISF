package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyZHIterator theJournal = (JournalNameCurrencyZHIterator)findAncestorWithClass(this, JournalNameCurrencyZHIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

