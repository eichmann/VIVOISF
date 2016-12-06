package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyESIterator theCompany = (CompanyNameCurrencyESIterator)findAncestorWithClass(this, CompanyNameCurrencyESIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

