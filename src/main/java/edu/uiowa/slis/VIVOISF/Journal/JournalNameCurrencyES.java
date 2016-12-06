package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameCurrencyESIterator theJournal = (JournalNameCurrencyESIterator)findAncestorWithClass(this, JournalNameCurrencyESIterator.class);
			pageContext.getOut().print(theJournal.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

