package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryAgriculturalAreaTotalIterator theTerritory = (TerritoryAgriculturalAreaTotalIterator)findAncestorWithClass(this, TerritoryAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theTerritory.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

