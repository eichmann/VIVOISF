package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyZHIterator theReport = (ReportNameCurrencyZHIterator)findAncestorWithClass(this, ReportNameCurrencyZHIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

