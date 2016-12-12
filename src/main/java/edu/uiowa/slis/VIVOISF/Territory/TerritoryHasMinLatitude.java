package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHasMinLatitudeIterator theTerritory = (TerritoryHasMinLatitudeIterator)findAncestorWithClass(this, TerritoryHasMinLatitudeIterator.class);
			pageContext.getOut().print(theTerritory.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

