package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyPopulationYearIterator theCompany = (CompanyPopulationYearIterator)findAncestorWithClass(this, CompanyPopulationYearIterator.class);
			pageContext.getOut().print(theCompany.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

