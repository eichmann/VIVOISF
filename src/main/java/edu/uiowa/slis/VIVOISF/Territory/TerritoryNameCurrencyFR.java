package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyFRIterator theTerritory = (TerritoryNameCurrencyFRIterator)findAncestorWithClass(this, TerritoryNameCurrencyFRIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

