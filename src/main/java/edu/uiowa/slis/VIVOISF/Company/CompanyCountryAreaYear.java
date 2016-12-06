package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCountryAreaYearIterator theCompany = (CompanyCountryAreaYearIterator)findAncestorWithClass(this, CompanyCountryAreaYearIterator.class);
			pageContext.getOut().print(theCompany.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

