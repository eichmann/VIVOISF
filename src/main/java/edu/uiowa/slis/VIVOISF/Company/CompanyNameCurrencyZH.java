package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyZHIterator theCompany = (CompanyNameCurrencyZHIterator)findAncestorWithClass(this, CompanyNameCurrencyZHIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

