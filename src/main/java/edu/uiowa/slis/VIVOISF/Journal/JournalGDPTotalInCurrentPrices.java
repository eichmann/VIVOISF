package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGDPTotalInCurrentPricesIterator theJournal = (JournalGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, JournalGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theJournal.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

