package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyRUIterator theCompany = (CompanyNameCurrencyRUIterator)findAncestorWithClass(this, CompanyNameCurrencyRUIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

