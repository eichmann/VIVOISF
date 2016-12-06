package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyITIterator theJournal = (JournalNameCurrencyITIterator)findAncestorWithClass(this, JournalNameCurrencyITIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

