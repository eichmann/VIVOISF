package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyFRIterator theReport = (ReportNameCurrencyFRIterator)findAncestorWithClass(this, ReportNameCurrencyFRIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

