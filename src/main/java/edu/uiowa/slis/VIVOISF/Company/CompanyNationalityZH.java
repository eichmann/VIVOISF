package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityZHIterator theCompany = (CompanyNationalityZHIterator)findAncestorWithClass(this, CompanyNationalityZHIterator.class);
			pageContext.getOut().print(theCompany.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

