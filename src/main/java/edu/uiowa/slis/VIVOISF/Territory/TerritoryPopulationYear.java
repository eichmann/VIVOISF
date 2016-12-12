package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryPopulationYearIterator theTerritory = (TerritoryPopulationYearIterator)findAncestorWithClass(this, TerritoryPopulationYearIterator.class);
			pageContext.getOut().print(theTerritory.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

