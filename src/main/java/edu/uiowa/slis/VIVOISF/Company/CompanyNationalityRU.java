package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNationalityRUIterator theCompany = (CompanyNationalityRUIterator)findAncestorWithClass(this, CompanyNationalityRUIterator.class);
			pageContext.getOut().print(theCompany.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

