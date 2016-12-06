package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyESIterator theReport = (ReportNameCurrencyESIterator)findAncestorWithClass(this, ReportNameCurrencyESIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

