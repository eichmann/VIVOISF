package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyPopulationTotalIterator theCompany = (CompanyPopulationTotalIterator)findAncestorWithClass(this, CompanyPopulationTotalIterator.class);
			pageContext.getOut().print(theCompany.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

