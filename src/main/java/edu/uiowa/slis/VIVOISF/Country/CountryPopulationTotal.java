package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryPopulationTotalIterator theCountry = (CountryPopulationTotalIterator)findAncestorWithClass(this, CountryPopulationTotalIterator.class);
			pageContext.getOut().print(theCountry.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

