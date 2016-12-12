package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryLandAreaYearIterator theTerritory = (TerritoryLandAreaYearIterator)findAncestorWithClass(this, TerritoryLandAreaYearIterator.class);
			pageContext.getOut().print(theTerritory.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

