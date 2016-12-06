package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyENIterator theJournal = (JournalNameCurrencyENIterator)findAncestorWithClass(this, JournalNameCurrencyENIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

