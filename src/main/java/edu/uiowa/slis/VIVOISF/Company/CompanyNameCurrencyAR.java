package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameCurrencyARIterator theCompany = (CompanyNameCurrencyARIterator)findAncestorWithClass(this, CompanyNameCurrencyARIterator.class);
			pageContext.getOut().print(theCompany.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

