package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityENIterator theCompany = (CompanyNationalityENIterator)findAncestorWithClass(this, CompanyNationalityENIterator.class);
			pageContext.getOut().print(theCompany.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

