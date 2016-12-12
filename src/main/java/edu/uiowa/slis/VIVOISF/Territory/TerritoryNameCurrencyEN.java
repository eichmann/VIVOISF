package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyENIterator theTerritory = (TerritoryNameCurrencyENIterator)findAncestorWithClass(this, TerritoryNameCurrencyENIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

