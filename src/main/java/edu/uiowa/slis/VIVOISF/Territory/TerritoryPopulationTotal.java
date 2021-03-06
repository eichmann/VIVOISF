package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryPopulationTotalIterator theTerritory = (TerritoryPopulationTotalIterator)findAncestorWithClass(this, TerritoryPopulationTotalIterator.class);
			pageContext.getOut().print(theTerritory.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

