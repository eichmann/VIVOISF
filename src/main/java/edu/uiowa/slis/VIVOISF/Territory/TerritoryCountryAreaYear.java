package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCountryAreaYearIterator theTerritory = (TerritoryCountryAreaYearIterator)findAncestorWithClass(this, TerritoryCountryAreaYearIterator.class);
			pageContext.getOut().print(theTerritory.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

