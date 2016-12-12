package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryGeographicFocusOfIterator theTerritoryGeographicFocusOfIterator = (TerritoryGeographicFocusOfIterator)findAncestorWithClass(this, TerritoryGeographicFocusOfIterator.class);
			pageContext.getOut().print(theTerritoryGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

