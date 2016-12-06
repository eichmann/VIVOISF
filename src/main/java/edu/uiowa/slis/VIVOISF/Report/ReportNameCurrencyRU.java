package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyRUIterator theReport = (ReportNameCurrencyRUIterator)findAncestorWithClass(this, ReportNameCurrencyRUIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

