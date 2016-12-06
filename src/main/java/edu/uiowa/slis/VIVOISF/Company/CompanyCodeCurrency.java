package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeCurrencyIterator theCompany = (CompanyCodeCurrencyIterator)findAncestorWithClass(this, CompanyCodeCurrencyIterator.class);
			pageContext.getOut().print(theCompany.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

