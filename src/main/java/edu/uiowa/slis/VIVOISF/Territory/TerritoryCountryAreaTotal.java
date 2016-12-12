package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCountryAreaTotalIterator theTerritory = (TerritoryCountryAreaTotalIterator)findAncestorWithClass(this, TerritoryCountryAreaTotalIterator.class);
			pageContext.getOut().print(theTerritory.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

