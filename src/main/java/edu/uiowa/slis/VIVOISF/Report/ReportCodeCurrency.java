package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeCurrencyIterator theReport = (ReportCodeCurrencyIterator)findAncestorWithClass(this, ReportCodeCurrencyIterator.class);
			pageContext.getOut().print(theReport.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

