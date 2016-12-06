package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportGDPTotalInCurrentPricesIterator theReport = (ReportGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ReportGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theReport.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

