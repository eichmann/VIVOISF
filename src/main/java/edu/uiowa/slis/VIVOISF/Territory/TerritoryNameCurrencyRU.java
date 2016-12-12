package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyRUIterator theTerritory = (TerritoryNameCurrencyRUIterator)findAncestorWithClass(this, TerritoryNameCurrencyRUIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

