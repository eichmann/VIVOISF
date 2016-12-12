package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyITIterator theTerritory = (TerritoryNameCurrencyITIterator)findAncestorWithClass(this, TerritoryNameCurrencyITIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

