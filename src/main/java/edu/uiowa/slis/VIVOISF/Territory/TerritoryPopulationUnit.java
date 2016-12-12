package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryPopulationUnitIterator theTerritory = (TerritoryPopulationUnitIterator)findAncestorWithClass(this, TerritoryPopulationUnitIterator.class);
			pageContext.getOut().print(theTerritory.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

