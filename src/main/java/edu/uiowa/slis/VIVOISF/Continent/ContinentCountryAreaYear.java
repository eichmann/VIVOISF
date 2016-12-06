package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCountryAreaYearIterator theContinent = (ContinentCountryAreaYearIterator)findAncestorWithClass(this, ContinentCountryAreaYearIterator.class);
			pageContext.getOut().print(theContinent.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

