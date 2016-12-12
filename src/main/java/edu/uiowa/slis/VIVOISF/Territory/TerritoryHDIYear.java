package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHDIYearIterator theTerritory = (TerritoryHDIYearIterator)findAncestorWithClass(this, TerritoryHDIYearIterator.class);
			pageContext.getOut().print(theTerritory.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

