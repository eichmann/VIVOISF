package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameCurrencyARIterator theReport = (ReportNameCurrencyARIterator)findAncestorWithClass(this, ReportNameCurrencyARIterator.class);
			pageContext.getOut().print(theReport.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

