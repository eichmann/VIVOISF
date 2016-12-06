package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyPopulationUnitIterator theCompany = (CompanyPopulationUnitIterator)findAncestorWithClass(this, CompanyPopulationUnitIterator.class);
			pageContext.getOut().print(theCompany.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

