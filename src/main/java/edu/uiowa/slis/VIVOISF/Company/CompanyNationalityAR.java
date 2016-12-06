package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityARIterator theCompany = (CompanyNationalityARIterator)findAncestorWithClass(this, CompanyNationalityARIterator.class);
			pageContext.getOut().print(theCompany.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

