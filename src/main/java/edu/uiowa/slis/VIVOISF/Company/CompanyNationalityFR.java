package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityFRIterator theCompany = (CompanyNationalityFRIterator)findAncestorWithClass(this, CompanyNationalityFRIterator.class);
			pageContext.getOut().print(theCompany.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

