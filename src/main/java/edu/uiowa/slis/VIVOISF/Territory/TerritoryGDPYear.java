package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryGDPYearIterator theTerritory = (TerritoryGDPYearIterator)findAncestorWithClass(this, TerritoryGDPYearIterator.class);
			pageContext.getOut().print(theTerritory.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

