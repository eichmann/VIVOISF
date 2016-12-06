package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCountryAreaUnitIterator theCompany = (CompanyCountryAreaUnitIterator)findAncestorWithClass(this, CompanyCountryAreaUnitIterator.class);
			pageContext.getOut().print(theCompany.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

