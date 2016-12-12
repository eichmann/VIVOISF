package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHasMaxLongitudeIterator theTerritory = (TerritoryHasMaxLongitudeIterator)findAncestorWithClass(this, TerritoryHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theTerritory.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

