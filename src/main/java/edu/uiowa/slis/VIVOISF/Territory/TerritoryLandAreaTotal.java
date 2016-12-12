package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryLandAreaTotalIterator theTerritory = (TerritoryLandAreaTotalIterator)findAncestorWithClass(this, TerritoryLandAreaTotalIterator.class);
			pageContext.getOut().print(theTerritory.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

