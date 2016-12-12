package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryAgriculturalAreaUnitIterator theTerritory = (TerritoryAgriculturalAreaUnitIterator)findAncestorWithClass(this, TerritoryAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theTerritory.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

