package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryValidSinceIterator theTerritory = (TerritoryValidSinceIterator)findAncestorWithClass(this, TerritoryValidSinceIterator.class);
			pageContext.getOut().print(theTerritory.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for validSince tag ");
		}
		return SKIP_BODY;
	}
}

