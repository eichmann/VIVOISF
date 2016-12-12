package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeCurrencyIterator theTerritory = (TerritoryCodeCurrencyIterator)findAncestorWithClass(this, TerritoryCodeCurrencyIterator.class);
			pageContext.getOut().print(theTerritory.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

