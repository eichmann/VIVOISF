package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCountryAreaTotalIterator theCompany = (CompanyCountryAreaTotalIterator)findAncestorWithClass(this, CompanyCountryAreaTotalIterator.class);
			pageContext.getOut().print(theCompany.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

