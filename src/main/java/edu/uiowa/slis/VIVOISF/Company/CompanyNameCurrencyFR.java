package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyFRIterator theCompany = (CompanyNameCurrencyFRIterator)findAncestorWithClass(this, CompanyNameCurrencyFRIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

