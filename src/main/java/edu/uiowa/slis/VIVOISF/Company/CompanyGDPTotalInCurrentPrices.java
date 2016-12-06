package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyGDPTotalInCurrentPricesIterator theCompany = (CompanyGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, CompanyGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theCompany.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

