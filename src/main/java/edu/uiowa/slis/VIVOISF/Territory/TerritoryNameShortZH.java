package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortZHIterator theTerritory = (TerritoryNameShortZHIterator)findAncestorWithClass(this, TerritoryNameShortZHIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

