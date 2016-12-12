package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryGDPUnitIterator theTerritory = (TerritoryGDPUnitIterator)findAncestorWithClass(this, TerritoryGDPUnitIterator.class);
			pageContext.getOut().print(theTerritory.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

