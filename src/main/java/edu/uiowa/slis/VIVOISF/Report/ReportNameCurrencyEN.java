package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyENIterator theReport = (ReportNameCurrencyENIterator)findAncestorWithClass(this, ReportNameCurrencyENIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

