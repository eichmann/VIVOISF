package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryAgriculturalAreaYearIterator theTerritory = (TerritoryAgriculturalAreaYearIterator)findAncestorWithClass(this, TerritoryAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theTerritory.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

