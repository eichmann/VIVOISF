package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyITIterator theCompany = (CompanyNameCurrencyITIterator)findAncestorWithClass(this, CompanyNameCurrencyITIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

