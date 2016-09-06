package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryPopulationYearIterator theCountry = (CountryPopulationYearIterator)findAncestorWithClass(this, CountryPopulationYearIterator.class);
			pageContext.getOut().print(theCountry.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

