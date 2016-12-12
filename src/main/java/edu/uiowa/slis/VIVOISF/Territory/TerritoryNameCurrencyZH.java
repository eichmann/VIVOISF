package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameCurrencyZHIterator theTerritory = (TerritoryNameCurrencyZHIterator)findAncestorWithClass(this, TerritoryNameCurrencyZHIterator.class);
			pageContext.getOut().print(theTerritory.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

