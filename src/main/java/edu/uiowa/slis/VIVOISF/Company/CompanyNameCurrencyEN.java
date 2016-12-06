package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyENIterator theCompany = (CompanyNameCurrencyENIterator)findAncestorWithClass(this, CompanyNameCurrencyENIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

