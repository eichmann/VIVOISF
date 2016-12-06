package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityITIterator theCompany = (CompanyNationalityITIterator)findAncestorWithClass(this, CompanyNationalityITIterator.class);
			pageContext.getOut().print(theCompany.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

