package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHasMaxLatitudeIterator theTerritory = (TerritoryHasMaxLatitudeIterator)findAncestorWithClass(this, TerritoryHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theTerritory.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

