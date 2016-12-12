package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryLandAreaUnitIterator theTerritory = (TerritoryLandAreaUnitIterator)findAncestorWithClass(this, TerritoryLandAreaUnitIterator.class);
			pageContext.getOut().print(theTerritory.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

