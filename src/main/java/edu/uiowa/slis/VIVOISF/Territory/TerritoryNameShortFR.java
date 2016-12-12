package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortFRIterator theTerritory = (TerritoryNameShortFRIterator)findAncestorWithClass(this, TerritoryNameShortFRIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

