package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryPopulationUnitIterator theCountry = (CountryPopulationUnitIterator)findAncestorWithClass(this, CountryPopulationUnitIterator.class);
			pageContext.getOut().print(theCountry.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

