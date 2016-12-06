package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityESIterator theCompany = (CompanyNationalityESIterator)findAncestorWithClass(this, CompanyNationalityESIterator.class);
			pageContext.getOut().print(theCompany.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

