package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHDITotalIterator theTerritory = (TerritoryHDITotalIterator)findAncestorWithClass(this, TerritoryHDITotalIterator.class);
			pageContext.getOut().print(theTerritory.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

