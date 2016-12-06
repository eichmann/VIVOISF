package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyITIterator theReport = (ReportNameCurrencyITIterator)findAncestorWithClass(this, ReportNameCurrencyITIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

