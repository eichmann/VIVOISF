package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCountryAreaUnitIterator theTerritory = (TerritoryCountryAreaUnitIterator)findAncestorWithClass(this, TerritoryCountryAreaUnitIterator.class);
			pageContext.getOut().print(theTerritory.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

